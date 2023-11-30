import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        char[] bad = in.readLine().toCharArray();
        char[] output = in.readLine().toCharArray();
        Set<Character> set = new HashSet<>();
        int flag = 0;
        for (int i = 0; i < bad.length; i++) {
            if (bad[i] == '+') flag = 1;
            set.add(bad[i]);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < output.length; i++) {
            if (!set.contains(output[i])) {
                if (Character.isUpperCase(output[i]) && set.contains('+')) {
                } else if (!set.contains(Character.toUpperCase(output[i]))) {
                    sb.append(output[i]);
                }
            }
        }
        System.out.println(sb);
    }
}