import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        in.nextToken();
        int n = (int) in.nval;
        long sum = 0;
        double temp;
        for (int i = 1; i <= n; i++) {
            in.nextToken();
            temp = in.nval;
            sum += (long) (temp * 1000) * i * (n - i + 1);
        }
        System.out.printf("%.2f", sum / 1000.0);
    }
}