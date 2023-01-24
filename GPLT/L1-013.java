import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        int temp = 1, sum = 0;
        for (int i = 1; i <= n; i++) {
            temp *= i;
            sum += temp;
        }
        System.out.println(sum);
    }
}