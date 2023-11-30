import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] input = in.readLine().split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = input.length - 1; i >= 0; i--) {
            sb.append(input[i]);
            if (i > 0) sb.append(" ");
        }
        System.out.println(sb);
    }
}