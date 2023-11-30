import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] input = in.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        int x = Integer.parseInt(input[2]);
        String[][] t = new String[n + 1][n + 1];
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            StringBuilder sb = new StringBuilder();
            if (i % 2 != 0) {
                int len = (cnt % k) + 1;
                for (int j = 0; j < len; j++) {
                    sb.append(x).append(" ");
                }
                cnt++;
            }
            t[i] = String.valueOf(sb.append(in.readLine())).split(" ");
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            for (int j = 1; j <= n; j++) {
                sum += Integer.parseInt(t[j][i - 1]);
            }
            if (i > 1) sb.append(" ");
            sb.append(sum);
        }
        System.out.println(sb);
    }
}