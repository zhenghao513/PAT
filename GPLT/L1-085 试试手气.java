import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] input = in.readLine().split(" ");
        int n = Integer.parseInt(in.readLine());
        int[][] map = new int[7][7];
        for (int i = 1; i < 7; i++) {
            map[i][Integer.parseInt(input[i - 1])] = 1;
        }
        int[] ans = new int[7];
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < 7; j++) {
                for (int k = 6; k > 0; k--) {
                    if (map[j][k] != 1) {
                        map[j][k] = 1;
                        ans[j] = k;
                        break;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < ans.length; i++) {
            if (i > 1) sb.append(" ");
            sb.append(ans[i]);
        }
        System.out.println(sb);

    }
}