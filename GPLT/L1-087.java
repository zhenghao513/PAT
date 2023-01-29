import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] input = in.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int q = Integer.parseInt(input[2]);
        int[][] map = new int[n + 1][m + 1];
        for (int i = 0; i < q; i++) {
            input = in.readLine().split(" ");
            int t = Integer.parseInt(input[0]);
            int c = Integer.parseInt(input[1]);
            if (t == 0) {
                for (int j = 1; j <= m; j++) {
                    map[c][j] = 1;
                }
            } else {
                for (int j = 1; j <= n; j++) {
                    map[j][c] = 1;
                }
            }
        }
        int cnt = 0;
        for (int i = 1; i < map.length; i++) {
            for (int j = 1; j < map[i].length; j++) {
                if (map[i][j] != 1) cnt++;
            }
        }
        System.out.println(cnt);
    }
}