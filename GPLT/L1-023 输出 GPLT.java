import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = in.readLine().toLowerCase().toCharArray();
        int g = 0, p = 0, l = 0, t = 0;
        for (char aChar : chars) {
            switch (aChar) {
                case 'g':
                    g++;
                    break;
                case 'p':
                    p++;
                    break;
                case 'l':
                    l++;
                    break;
                case 't':
                    t++;
                    break;
            }
        }
        StringBuilder sb = new StringBuilder();
        while (g > 0 || p > 0 || l > 0 || t > 0) {
            if (g > 0) {
                sb.append("G");
                g--;
            }
            if (p > 0) {
                sb.append("P");
                p--;
            }
            if (l > 0) {
                sb.append("L");
                l--;
            }
            if (t > 0) {
                sb.append("T");
                t--;
            }
        }
        System.out.println(sb);
    }
}