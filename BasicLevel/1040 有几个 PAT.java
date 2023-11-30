import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s = in.readLine();
        int length = s.length();
        int p = 0, pa = 0, pat = 0;
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (c == 'P') {
                p++;
            } else if (c == 'A') {
                pa += p;
                pa %= 1000000007;
            } else if (c == 'T') {
                pat += pa;
                pat %= 1000000007;
            }
        }
        System.out.println(pat);
    }
}