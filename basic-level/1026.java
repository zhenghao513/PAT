import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] input = in.readLine().split(" ");
        int c1 = Integer.parseInt(input[0]);
        int c2 = Integer.parseInt(input[1]);
        double x = (c2 - c1) / 100.0;
        int h = (int) x / 3600;
        int m = (int) x % 3600 / 60;
        double s = x % 3600 % 60;
        System.out.printf("%02d:%02d:%02d", h, m, Math.round(s));
    }
}