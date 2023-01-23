import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int gcd(int a, int b) {
        int t;
        while (b != 0) {
            t = a % b;
            a = b;
            b = t;
        }
        return a;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] input = in.readLine().split(" ");
        String[] a = input[0].split("/");
        String[] b = input[1].split("/");
        int k = Integer.parseInt(input[2]);
        int n1 = Integer.parseInt(a[0]);
        int m1 = Integer.parseInt(a[1]);
        int n2 = Integer.parseInt(b[0]);
        int m2 = Integer.parseInt(b[1]);
        int gcd = gcd(m1, m2);
        gcd = gcd(gcd, k);
        int lcm = m1 * m2 / gcd;
        n1 = n1 * (lcm / m1);
        n2 = n2 * (lcm / m2);
        int m = lcm;
        int x = lcm / k;
        m /= x;
        n1 /= x;
        n2 /= x;
        StringBuilder sb = new StringBuilder();
        for (int i = n1; i <= n2; i++) {
            if (m % i != 0) sb.append(String.format("%d/%d", i, m)).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}