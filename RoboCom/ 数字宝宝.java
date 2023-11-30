import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] input = in.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int A = 0, B = 1;
        while (a != 0) {
            A += a % 10;
            a /= 10;
        }
        while (b != 0) {
            B *= b % 10;
            b /= 10;
        }
        if (A >= B) {
            System.out.printf("%d%d", A, B);
        } else {
            System.out.printf("%d%d", B, A);
        }
    }
}