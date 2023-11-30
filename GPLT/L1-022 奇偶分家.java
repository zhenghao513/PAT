import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        String[] input = in.readLine().split(" ");
        int odd = 0, even = 0;
        for (int i = 0; i < input.length; i++) {
            int num = Integer.parseInt(input[i]);
            if ((num & 1) == 1) odd++;
            else even++;
        }
        System.out.printf("%d %d", odd, even);
    }
}