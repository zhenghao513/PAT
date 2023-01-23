import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        String[] input = in.readLine().split(" ");
        int[] num = new int[n];
        for (int i = 0; i < input.length; i++) {
            num[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(num);
        for (int i = 0; i < num.length; i++) {
            if (num.length - i + 1 == num[i]) {
                System.out.println(num[i - 1]);
                return;
            }
        }
    }
}