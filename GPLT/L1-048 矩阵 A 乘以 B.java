import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    static int[][] a = new int[101][101];
    static int[][] b = new int[101][101];
    static int ra, ca, rb, cb;

    static int f(int r, int c) {
        int sum = 0;
        for (int i = 1; i <= ca; i++)
            sum += a[r][i] * b[i][c];
        return sum;

    }

    public static void main(String[] args) throws IOException {
        StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        in.nextToken();
        ra = (int) in.nval;
        in.nextToken();
        ca = (int) in.nval;
        for (int i = 1; i <= ra; i++) {
            for (int j = 1; j <= ca; j++) {
                in.nextToken();
                a[i][j] = (int) in.nval;
            }
        }

        in.nextToken();
        rb = (int) in.nval;
        in.nextToken();
        cb = (int) in.nval;
        for (int i = 1; i <= rb; i++) {
            for (int j = 1; j <= cb; j++) {
                in.nextToken();
                b[i][j] = (int) in.nval;
            }
        }

        if (ca != rb) {
            System.out.printf("Error: %d != %d", ca, rb);
        } else {
            System.out.printf("%d %d\n", ra, cb);
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i <= ra; i++) {
                for (int j = 1; j <= cb; j++) {
                    if (j > 1) sb.append(" ");
                    sb.append(f(i, j));
                }
                sb.append("\n");
            }
            System.out.print(sb);
        }
    }
}