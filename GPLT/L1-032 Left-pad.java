import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static String leftPad(int n, String shape, String s) {
        int length = s.length();
        if (length < n) {
            int count = n - length;
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < count; i++) {
                sb.append(shape);
            }
            return sb.append(s).toString();
        } else {
            return s.substring(length - n);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] input = in.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        String shape = input[1];
        String s = in.readLine();
        System.out.println(leftPad(n, shape, s));
    }
}