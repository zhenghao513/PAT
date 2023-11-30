import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        label:
        for (int i = 0; i < n; i++) {
            char[] chars = in.readLine().toCharArray();
            for (int j = 0; j < chars.length - 1; j++) {
                if (chars[j] >= 'A' && chars[j] <= 'Z') {
                    if (chars[j] == 'Z' && chars[j + 1] != 'z') {
                        System.out.println("N");
                        continue label;
                    }
                    if (chars[j + 1] != (char) (chars[j] + 32) && chars[j + 1] != (char) (chars[j] + 1)) {
                        System.out.println("N");
                        continue label;
                    }
                } else if (chars[j] >= 'a' && chars[j] <= 'z') {
                    if (chars[j] == 'a' && chars[j + 1] != 'A') {
                        System.out.println("N");
                        continue label;
                    }
                    if (chars[j + 1] != (char) (chars[j] - 32) && chars[j + 1] != (char) (chars[j] - 1)) {
                        System.out.println("N");
                        continue label;
                    }
                }
            }
            System.out.println("Y");
        }
    }
}