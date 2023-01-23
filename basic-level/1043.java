import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = in.readLine().toCharArray();
        int P = 0, A = 0, T = 0, e = 0, s = 0, t = 0;
        for (char aChar : chars) {
            if (aChar == 'P') P++;
            else if (aChar == 'A') A++;
            else if (aChar == 'T') T++;
            else if (aChar == 'e') e++;
            else if (aChar == 's') s++;
            else if (aChar == 't') t++;
        }
        StringBuilder sb = new StringBuilder();
        while (P != 0 || A != 0 || T != 0 || e != 0 || s != 0 || t != 0) {
            if (P > 0) {
                sb.append("P");
                P--;
            }
            if (A > 0) {
                sb.append("A");
                A--;
            }
            if (T > 0) {
                sb.append("T");
                T--;
            }
            if (e > 0) {
                sb.append("e");
                e--;
            }
            if (s > 0) {
                sb.append("s");
                s--;
            }
            if (t > 0) {
                sb.append("t");
                t--;
            }
        }
        System.out.println(sb);
    }
}