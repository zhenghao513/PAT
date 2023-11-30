import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        in.nextToken();
        int m = (int) in.nval;
        in.nextToken();
        int n = (int) in.nval;
        in.nextToken();
        int a = (int) in.nval;
        in.nextToken();
        int b = (int) in.nval;
        in.nextToken();
        int color = (int) in.nval;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n - 1; j++) {
                in.nextToken();
                int res = (int) in.nval;
                if (res >= a && res <= b)
                    res = color;
                sb.append(String.format("%03d", res)).append(" ");
            }
            in.nextToken();
            int res = (int) in.nval;
            sb.append(String.format("%03d", (res >= a && res <= b ? color : res)));
            sb.append("\n");
        }
        System.out.print(sb);
    }
}