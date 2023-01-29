import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char[] chars = in.readLine().toCharArray();
            int left = 0, right = 0;
            for (int j = 0; j < 3; j++) {
                left += chars[j] - '0';
                right += chars[5 - j] - '0';
            }
            if (i > 0) sb.append("\n");
            if (left == right) sb.append("You are lucky!");
            else sb.append("Wish you good luck.");
        }
        System.out.println(sb);
    }
}