import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] input = in.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);
        if (a > b) a = a + b - (b = a);
        if (b > c) b = b + c - (c = b);
        if (a > b) a = a + b - (b = a);
        System.out.printf("%d->%d->%d", a, b, c);
    }
}