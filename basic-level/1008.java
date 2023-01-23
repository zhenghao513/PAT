import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] input = in.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        input = in.readLine().split(" ");
        while (m >= n) {
            m -= n;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = n - m; i < n; i++) {
            sb.append(input[i]).append(" ");
        }
        for (int i = 0; i < n - m; i++) {
            sb.append(input[i]).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}