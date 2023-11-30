import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String[] input = in.readLine().split(" ");
            double h = Double.parseDouble(input[1]);
            if (i > 0) sb.append("\n");
            if (input[0].equals("F")) sb.append(String.format("%.2f", h * 1.09));
            else sb.append(String.format("%.2f", h / 1.09));
        }
        System.out.println(sb);
    }
}