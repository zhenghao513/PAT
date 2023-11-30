import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = in.readLine().toCharArray();
        double ans = 1, two = 0;
        int length = chars[0] == '-' ? chars.length - 1 : chars.length;
        if (chars[0] == '-') ans *= 1.5;
        if ((chars[chars.length - 1] - '0') % 2 == 0) ans *= 2;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '2') two++;
        }
        ans *= two / length * 100;
        System.out.printf("%.2f%%", ans);
    }
}