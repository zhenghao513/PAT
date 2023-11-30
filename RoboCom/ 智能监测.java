import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] input = in.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int t = Integer.parseInt(input[1]);
        int low = 80 - t, high = 80 + t;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String s = in.readLine();
            input = s.split(" ");
            int data = Integer.parseInt(input[1]);
            if (data < low || data > high) {
                sb.append(s).append("\n");
            }
        }
        System.out.print(sb);
    }
}