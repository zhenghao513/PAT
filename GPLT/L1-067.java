import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] input = in.readLine().split(" ");
        double a = Double.parseDouble(input[0]);
        int b = Integer.parseInt(input[1]);
        double c = Double.parseDouble(input[2]);
        double ans = b == 0 ? a * 2.455 : a * 1.26;
        System.out.printf("%.2f %s", ans, ans > c ? "T_T" : "^_^");
    }
}