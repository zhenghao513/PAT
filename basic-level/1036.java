import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] input = in.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        String c = input[1];
        int row = (int) Math.round(n * 0.5);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == row - 1) sb.append(c);
                else if (j == 0 || j == n - 1) sb.append(c);
                else sb.append(" ");
            }
            if (i < row - 1) sb.append("\n");
        }
        System.out.print(sb);
    }
}