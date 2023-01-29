import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] input = in.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            if (i > 0) sb.append("\n");
            char[] chars = in.readLine().toCharArray();
            int left = 1, right = (int) Math.pow(2, n), mid = left + (right - left) / 2;
            for (char aChar : chars) {
                if (aChar == 'y') right = mid - 1;
                else left = mid + 1;
                mid = left + (right - left) / 2;
            }
            sb.append(mid);
        }
        System.out.println(sb);
    }
}