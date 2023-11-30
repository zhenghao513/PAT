import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static boolean isPrime(int n) {
        if (n <= 3) return n > 1;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] input = in.readLine().split(" ");
        int L = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);
        String N = in.readLine();
        for (int i = 0; i + K <= L; i++) {
            String s = N.substring(i, i + K);
            if (isPrime(Integer.parseInt(s))) {
                System.out.println(s);
                return;
            }
        }
        System.out.println("404");
    }
}