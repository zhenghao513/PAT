import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine()), temp;
        int first = 0, len = 0, maxn = (int) Math.sqrt(n) + 1;
        for (int i = 2; i <= maxn; i++) {
            temp = 1;
            int j;
            for (j = i; j <= maxn; j++) {
                temp *= j;
                if (n % temp != 0) break;
            }
            if (j - i > len) {
                len = j - i;
                first = i;
            }
        }
        if (len == 0) {
            System.out.printf("1\n%d", n);
        } else {
            System.out.println(len);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < len; i++) {
                if (i > 0) sb.append("*");
                sb.append(first + i);
            }
            System.out.println(sb);
        }

    }
}