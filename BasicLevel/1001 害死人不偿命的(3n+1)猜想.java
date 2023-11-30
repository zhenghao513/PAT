import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        int cnt = 0;
        while (n != 1) {
            if (0 == (n & 1)) n /= 2;
            else n = (3 * n + 1) / 2;
            cnt++;
        }
        System.out.println(cnt);
    }
}