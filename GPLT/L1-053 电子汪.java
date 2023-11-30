import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] input = in.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int ans = a + b;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ans; i++) {
            sb.append("Wang!");
        }
        System.out.println(sb);
    }
}