import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] input = in.readLine().split(" ");
        System.out.printf("%.2f", Integer.parseInt(input[0]) * (Double.parseDouble(input[1]) / 10));
    }
}