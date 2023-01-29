import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] input = in.readLine().split(" ");
        int y = Integer.parseInt(input[0]);
        int n = Integer.parseInt(input[1]);
        Set<Character> set = new HashSet<>();
        for (int i = y; ; i++) {
            char[] chars = String.format("%04d", i).toCharArray();
            for (char aChar : chars) {
                set.add(aChar);
            }
            if (set.size() == n) {
                System.out.printf("%d %04d", i - y, i);
                break;
            }
            set.clear();
        }
    }
}