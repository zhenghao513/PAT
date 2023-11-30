import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] input = in.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        char c = input[1].charAt(0);
        char[] chars = in.readLine().toCharArray();
        StringBuilder sb = new StringBuilder();
        sb.append(c);
        for (int i = 0; i < chars.length; i++) {
            int num = chars[i] - '0';
            if (num == 0) {
                if (c >= 'A' && c <= 'Z') {
                    c += 32;
                    sb.append(c);
                } else if (c >= 'a' && c <= 'z') {
                    c -= 32;
                    sb.append(c);
                }
            } else {
                if (c >= 'A' && c < 'Z') {
                    c += 1;
                    sb.append(c);
                } else if (c > 'a' && c <= 'z') {
                    c -= 1;
                    sb.append(c);
                }
            }
        }
        System.out.println(sb);
    }
}