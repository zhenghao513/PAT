import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] input = in.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int sum = a + b;
        int ans = 1;
        for (int i = 1; i <= sum; i++) {
            ans *= i;
        }
        System.out.println(ans);
    }
}