import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static String leftPad(int len, String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            sb.append(0);
        }
        sb.append(s);
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] input = in.readLine().split(" ");
        int len = Math.max(input[0].length(), input[1].length());
        input[0] = input[0].length() == len ? input[0] : leftPad(len - input[0].length(), input[0]);
        input[1] = input[1].length() == len ? input[1] : leftPad(len - input[1].length(), input[1]);
        char[] a = input[0].toCharArray();
        char[] b = input[1].toCharArray();
        int index = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = len - 1; i >= 0; i--) {
            index++;
            int t;
            if (index % 2 == 0) {
                t = (b[i] - '0') - (a[i] - '0');
                if (t < 0) t += 10;
                sb.append(t);
            } else {
                t = (a[i] - '0' + b[i] - '0') % 13;
                if (t == 10) sb.append("J");
                else if (t == 11) sb.append("Q");
                else if (t == 12) sb.append("K");
                else sb.append(t);
            }
        }
        System.out.println(sb.reverse());
    }
}