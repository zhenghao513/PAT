import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s = in.readLine();
        int length = s.length();
        int num = Integer.parseInt(s);
        int left = num / 100;
        int right = num % 100;
        if (length == 4) {
            if (left < 22) System.out.printf("20%02d-%02d", left, right);
            else System.out.printf("19%02d-%02d", left, right);
        } else {
            System.out.printf("%04d-%02d", left, right);
        }
    }
}