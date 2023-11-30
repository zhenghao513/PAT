import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s = in.readLine();
        String[] input = new String[2];
        int indexOfSpace = s.indexOf(" ");
        input[0] = s.substring(0, indexOfSpace);
        input[1] = s.substring(indexOfSpace + 1);
        StringBuilder sb = new StringBuilder();
        boolean check = false;
        int a = 0, b = 0;
        if (input[0].matches("\\d+")) {
            a = Integer.parseInt(input[0]);
            if (a >= 1 && a <= 1000) {
                sb.append(input[0]).append(" + ");
            } else {
                sb.append("? + ");
                check = true;
            }
        } else {
            sb.append("? + ");
            check = true;
        }
        if (input[1].matches("\\d+")) {
            b = Integer.parseInt(input[1]);
            if (b >= 1 && b <= 1000) {
                sb.append(input[1]).append(" = ");
            } else {
                sb.append("? = ");
                check = true;
            }
        } else {
            sb.append("? = ");
            check = true;
        }
        if (check) {
            sb.append("?");
        } else {
            sb.append(a + b);
        }
        System.out.println(sb);
    }
}