import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int F = Integer.parseInt(in.readLine());
        System.out.printf("Celsius = %d", 5 * (F - 32) / 9);
    }
}