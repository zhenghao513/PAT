import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        String[] a = in.readLine().split(" ");
        int[] numbers = new int[a.length];
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(a[i]);
        }
        int[] res = new int[10001];
        for (int i = 0; i < n; i++) {
            res[Math.abs(numbers[i] - (i + 1))]++;
        }
        for (int i = res.length - 1; i >= 0; i--) {
            if (res[i] > 1) {
                System.out.println(i + " " + res[i]);
            }
        }
    }
}