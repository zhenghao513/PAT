import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        char[] a = in.readLine().toCharArray();
        char[] b = in.readLine().toCharArray();
        Set<Character> set = new HashSet<>();
        for (char c : a) {
            set.add(c);
        }
        for (char c : b) {
            set.add(c);
        }
        StringBuilder sb = new StringBuilder();
        for (char c : a) {
            if (set.contains(c)) {
                sb.append(c);
                set.remove(c);
            }
        }
        for (char c : b) {
            if (set.contains(c)) {
                sb.append(c);
                set.remove(c);
            }
        }
        System.out.println(sb);
    }
}