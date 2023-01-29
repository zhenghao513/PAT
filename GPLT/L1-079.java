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
        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(num);
        int min = num[0], max = num[n - 1];
        int minCount = 0, maxCount = 0;
        for (int j : num) {
            if (j == min) minCount++;
            if (j == max) maxCount++;
        }
        System.out.printf("%d %d\n", min, minCount);
        System.out.printf("%d %d", max, maxCount);

    }
}