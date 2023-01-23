import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static boolean isPrime(int n) {
        if (n <= 3) return n > 1;
        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(in.readLine());
        if (isPrime(num) && isPrime(num - 6)) {
            System.out.printf("Yes\n%d", num - 6);
        } else if (isPrime(num) && isPrime(num + 6)) {
            System.out.printf("Yes\n%d", num + 6);
        } else {
            System.out.println("No");
            for (int i = num + 1; ; i++) {
                if (isPrime(i) && isPrime(i - 6)) {
                    System.out.println(i);
                    break;
                }
                if (isPrime(i) && isPrime(i + 6)) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}