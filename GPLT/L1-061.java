import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] input = in.readLine().split(" ");
        double weight = Double.parseDouble(input[0]);
        double height = Double.parseDouble(input[1]);
        double compute = weight / Math.pow(height, 2);
        if (compute > 25) System.out.printf("%.1f\nPANG", compute);
        else System.out.printf("%.1f\nHai Xing", compute);
    }
}