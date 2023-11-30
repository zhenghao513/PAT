import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        String[] input = in.readLine().split(" ");
        double sum = 0;
        for (String s : input) {
            double v = 1 / Double.parseDouble(s);
            sum += v;
        }
        sum /= n;
        System.out.printf("%.2f", 1 / sum);
    }
}