import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static long gcd(long a, long b) {
        long c;
        while (b != 0) {
            c = a % b;
            a = b;
            b = c;
        }
        return a;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        String[] input = in.readLine().split(" ");
        for (int i = 1; i < input.length; i++) {
            String[] n1 = input[i - 1].split("/");
            String[] n2 = input[i].split("/");
            long a1 = Long.parseLong(n1[0]);
            long b1 = Long.parseLong(n1[1]);
            long a2 = Long.parseLong(n2[0]);
            long b2 = Long.parseLong(n2[1]);
            long lcm = b1 * b2 / gcd(b1, b2);
            a1 = a1 * (lcm / b1);
            a2 = a2 * (lcm / b2);
            input[i] = (a1 + a2) + "/" + lcm;
        }
        String[] split = input[n - 1].split("/");
        long a = Long.parseLong(split[0]);
        long b = Long.parseLong(split[1]);
        long gcd = gcd(a, b);
        a /= gcd;
        b /= gcd;
        // 判断是否可以整除，可以直接输出
        // 再判断整结果是否大于0，不是不输出整数部分
        System.out.println(a % b == 0 ? a / b : (a / b > 0 ? a / b + " " : "") + (a % b + "/" + b));
    }
}