import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        for (int i = 0; i < n; i++) {
            String s = in.readLine();
            long length = s.length() / 2;
            long num = Long.parseLong(s);
            long x = (long) Math.pow(10, length);
            long left = num / x;
            long right = num % x;
            if (right - left == 1) {
                if (Double.toString(Math.sqrt(num)).matches("\\d+[.]0")) {
                    System.out.println(2);
                } else {
                    System.out.println(1);
                }
            } else {
                System.out.println(0);
            }

        }
    }
}