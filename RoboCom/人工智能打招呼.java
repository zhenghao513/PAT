import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        String[] input = in.readLine().split(" ");
        int[] book = new int[1000000];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(input[i]);
            if (book[x] != 1) {
                sb.append("Hello ").append(input[i]).append(", how are you?");
                book[x] = 1;
            } else {
                sb.append("Hi ").append(input[i]).append("! Glad to see you again!");
            }
            if (i < n - 1) sb.append("\n");
        }
        System.out.println(sb);
    }
}