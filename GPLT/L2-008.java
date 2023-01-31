import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = in.readLine().toCharArray();
        int length = chars.length;
        int maxvalue = 0, temp;
        for (int i = 0; i < length; i++) {
            temp = 1;
            for (int j = 1; j < length; j++) {
                if (i - j < 0 || i + j >= length || chars[i - j] != chars[i + j]) break;
                temp += 2;
            }
            maxvalue = Math.max(maxvalue, temp);
            temp = 0;
            for (int j = 1; j < length; j++) {
                if (i - j + 1 < 0 || i + j >= length || chars[i - j + 1] != chars[i + j]) break;
                temp += 2;
            }
            maxvalue = Math.max(maxvalue, temp);
        }
        System.out.println(maxvalue);
    }
}