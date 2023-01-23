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
        int num = Integer.parseInt(in.readLine());
        int cnt = 0;
        for (int i = 5; i <= num; i++) {
            if (isPrime(i) && isPrime(i - 2)) cnt++;
        }
        System.out.println(cnt);
    }
}