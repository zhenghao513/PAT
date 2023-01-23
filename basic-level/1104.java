import java.util.Scanner;

public class Main {
    static boolean isPrime(long n) {
        if (n < 3) return false;
        for (long i = 3; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    static long gcd(long a, long b) {
        long c = -1;
        while (b != 0) {
            c = a % b;
            a = b;
            b = c;
        }
        return a;
    }

    static String format(int len, int n) {
        StringBuilder sb = new StringBuilder();
        if (n == 1) {
            for (int i = 0; i < len; i++) {
                if (i == 0) sb.append("1");
                else sb.append("0");
            }
        } else if (n == 9) {
            for (int i = 0; i < len; i++) {
                sb.append("9");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(String.format("%s %d\n", "Case", i + 1));
            int k = in.nextInt();
            int m = in.nextInt();
            long start = Long.parseLong(format(k, 1));
            long end = Long.parseLong(format(k, 9));
            boolean f = false;
            for (long j = start; j <= end; j++) {
                long a = j;
                long b = j + 1;
                int s1 = 0, s2 = 0;
                while (a != 0) {
                    s1 += a % 10;
                    a /= 10;
                }
                while (b != 0) {
                    s2 += b % 10;
                    b /= 10;
                }
                if (s1 == m && isPrime(gcd(s1, s2))) {
                    f = true;
                    sb.append(s2).append(" ").append(j).append("\n");
                }
            }
            if (!f) sb.append("No Solution\n");
        }
        System.out.print(sb);
    }
}
