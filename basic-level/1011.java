import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            String[] input = in.readLine().split(" ");
            long a = Long.parseLong(input[0]);
            long b = Long.parseLong(input[1]);
            long c = Long.parseLong(input[2]);
            sb.append(String.format("Case #%d: ", i)).append(a + b > c ? "true" : "false");
            if (i < n) sb.append("\n");
        }
        System.out.println(sb);
    }
}