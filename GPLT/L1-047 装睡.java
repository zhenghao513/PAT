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
            int breathe = Integer.parseInt(input[1]);
            int pulse = Integer.parseInt(input[2]);
            if (breathe<15||breathe>20||pulse<50||pulse>70) sb.append(input[0]).append("\n");
        }
        System.out.print(sb);
    }
}