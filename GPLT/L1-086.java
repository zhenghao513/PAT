import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static String f(char[] chars) {
        int length = chars.length;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < length; i++) {
            int newValue = chars[i] - '0';
            int oldValue = chars[i - 1] - '0';
            if (newValue % 2 == oldValue % 2) {
                sb.append(Math.max(newValue, oldValue));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        char[] chars1 = in.readLine().toCharArray();
        char[] chars2 = in.readLine().toCharArray();
        String f1 = f(chars1);
        String f2 = f(chars2);
        if (f1.equals(f2)) {
            System.out.println(f1);
        }else {
            System.out.println(f1);
            System.out.println(f2);
        }
    }
}