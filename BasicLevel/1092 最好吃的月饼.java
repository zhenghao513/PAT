import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    static StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));

    static int nextInt() throws IOException {
        in.nextToken();
        return (int) in.nval;
    }

    public static void main(String[] args) throws IOException {
        int n = nextInt();
        int m = nextInt();
        int[] sale = new int[n];
        int max = -1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sale[j] += nextInt();
                max = Math.max(max, sale[j]);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(max).append("\n");
        for (int i = 0; i < sale.length; i++) {
            if (sale[i] == max) {
                sb.append(i + 1).append(" ");
            }
        }
        System.out.println(sb.toString().trim());
    }
}