import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static String sort(char[] num, int flag) {
        Arrays.sort(num);
        if (flag == 0) return new String(num);
        StringBuilder sb = new StringBuilder();
        for (int i = num.length - 1; i >= 0; i--) {
            sb.append(num[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s = in.readLine();
        char[] num = String.format("%04d", Integer.parseInt(s)).toCharArray();
        int ans = 0;
        while (ans != 6174) {
            int a = Integer.parseInt(sort(num, 1));
            int b = Integer.parseInt(sort(num, 0));
            ans = a - b;
            System.out.printf("%04d - %04d = %04d\n", a, b, ans);
            if (ans == 0) break;
            num = String.format("%04d", ans).toCharArray();
        }
    }
}