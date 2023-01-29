import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(in.readLine());
        int one = 1, n = 1;
        // 必须保证one/x是个位数
        while (one < x) {
            one = one * 10 + 1;
            n++;
        }
        StringBuilder sb = new StringBuilder();
        while (one % x != 0) {
            sb.append(one / x);
            one = one % x * 10 + 1;
            n++;
        }
        sb.append(one / x);
        System.out.printf("%s %d", sb, n);
    }
}