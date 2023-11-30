import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] input = in.readLine().split(" ");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        int sum = 5000;
        int a = x * y / 2;
        int b = (100 - x) * y;
        int c = (100 - x) * (100 - y) / 2;
        System.out.println(sum - a - b - c);
    }
}