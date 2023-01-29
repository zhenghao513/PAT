import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static String isPrime(int n) {
        if (n < 2) return "No";
        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) return "No";
        }
        return "Yes";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i > 0) sb.append("\n");
            sb.append(isPrime(Integer.parseInt(in.readLine())));
        }
        System.out.println(sb);
    }
}