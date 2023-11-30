import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        int first = 0, second = 0;
        for (int i = 0; i < n; i++) {
            String[] input = in.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            int c = Integer.parseInt(input[2]);
            int d = Integer.parseInt(input[3]);
            int sum = a + c;
            if (b == d) continue;
            if (sum == b) second++;
            else if (sum == d) first++;
        }
        System.out.printf("%d %d", first, second);
    }
}