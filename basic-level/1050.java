import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class Main {
    static StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));

    static int nextInt() throws IOException {
        in.nextToken();
        return (int) in.nval;
    }

    public static void main(String[] args) throws IOException {
        int N = nextInt();
        int[] num = new int[N];
        for (int i = 0; i < num.length; i++) {
            num[i] = nextInt();
        }
        Arrays.sort(num);
        int abs = 100000, n = 0, m = 0;
        // 测试点3、4需要考虑N<=3的情况
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                int b = N / i;
                if (Math.abs(i - b) < abs) {
                    abs = Math.abs(i - b);
                    n = i;
                    m = b;
                }
            }
        }
        int[][] map = new int[m][n];
        int index = num.length - 1;
        int l1 = 0, l2 = 1, l3 = 1, l4 = 1;
        int i = 0, j = 0;
        for (int k = 0; k < num.length; k++) {
            map[i][j] = num[index];
            if (l1 == 0 && j + 1 < n && map[i][j + 1] == 0) {
                j++;
            } else if (l3 == 1 && l4 == 1 && l2 == 1) {
                l1 = 1;
                l2 = 0;
            }
            if (l2 == 0 && i + 1 < m && map[i + 1][j] == 0) {
                i++;
            } else if (l1 == 1 && l4 == 1 && l3 == 1) {
                l2 = 1;
                l3 = 0;
            }
            if (l3 == 0 && j - 1 >= 0 && map[i][j - 1] == 0) {
                j--;
            } else if (l1 == 1 && l2 == 1 && l4 == 1) {
                l3 = 1;
                l4 = 0;
            }
            if (l4 == 0 && i - 1 >= 0 && map[i - 1][j] == 0) {
                i--;
            } else if (l2 == 1 && l3 == 1 && l1 == 1) {
                l4 = 1;
                l1 = 0;
                if (j + 1 < n && map[i][j + 1] == 0) j++;
            }
            index--;
        }
        StringBuilder sb = new StringBuilder();
        for (int a = 0; a < map.length; a++) {
            for (int b = 0; b < map[a].length; b++) {
                if (b > 0) sb.append(" ");
                sb.append(map[a][b]);
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}