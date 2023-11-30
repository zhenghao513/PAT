import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] input = in.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int row = n * m;
        int[][] map = new int[n + 1][m + 1];
        for (int i = 1; i <= row; i++) {
            char[] c = in.readLine().toCharArray();
            int x = 1, y = 1;
            for (int j = 0; j < c.length; j++) {
                int op = c[j] - '0';
                if (op == 1 && y != m) {
                    y++;
                } else if (op == 2 && x != n) {
                    x++;
                } else if (op == 3 && y != 1) {
                    y--;
                } else if (op == 4 && x != 1) {
                    x--;
                }
            }
            if (map[x][y] == 0) {
                map[x][y] = i;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                sb.append(map[i][j]);
                if (j < m) sb.append(" ");
            }
            if (i < n) sb.append("\n");
        }
        System.out.println(sb);
    }
}