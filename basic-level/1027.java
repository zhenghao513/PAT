import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] input = in.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        String shape = input[1];
        int row = 1, need = 1, i;
        for (i = 3; 2 * i + need <= n; i += 2) {
            need += 2 * i;
            row++;
        }
        i -= 2;
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < row; j++) {
            for (int k = 0; k < j; k++) {
                sb.append(" ");
            }
            for (int k = 0; k < i; k++) {
                sb.append(shape);
            }
            sb.append("\n");
            i -= 2;
        }
        i += 4;
        for (int j = row - 2; j >= 0; j--) {
            for (int k = 0; k < j; k++) {
                sb.append(" ");
            }
            for (int k = 0; k < i; k++) {
                sb.append(shape);
            }
            sb.append("\n");
            i += 2;
        }
        System.out.printf("%s%d", sb, n - need);
    }
}