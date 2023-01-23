import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(in.readLine());
        String[] input = in.readLine().split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length; i++) {
            int num = Integer.parseInt(input[i]);
            if (i > 0) sb.append("\n");
            if (num % 2 == 0 && num > 2) sb.append("Yes");
            else sb.append("No");
        }
        System.out.println(sb);
    }
}