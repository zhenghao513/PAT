import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] input = in.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        if (b > 0) System.out.printf("%d/%d=%.2f", a, b, a / (double) b);
        else if (b < 0) System.out.printf("%d/(%d)=%.2f", a, b, a / (double) b);
        else System.out.printf("%d/%d=Error", a, b);
    }
}