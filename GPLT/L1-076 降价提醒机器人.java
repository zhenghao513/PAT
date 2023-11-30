import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] input = in.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            double price = Double.parseDouble(in.readLine());
            if (price < m) sb.append(String.format("On Sale! %.1f", price)).append("\n");
        }
        System.out.print(sb);
    }
}