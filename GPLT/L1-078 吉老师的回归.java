import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] input = in.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            String s = in.readLine();
            if (!s.contains("qiandao") && !s.contains("easy")) cnt++;
            if (cnt > m) {
                System.out.println(s);
                return;
            }
        }
        if (cnt <= m) System.out.println("Wo AK le");
    }
}