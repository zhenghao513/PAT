import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] input = in.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        String shape = input[1];
        int row = (int) Math.round(n * 0.5);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < row; i++) {
            if (i>0) sb.append("\n");
            for (int j = 0; j < n; j++) {
                sb.append(shape);
            }
        }
        System.out.println(sb);
    }
}