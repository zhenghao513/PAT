import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] a = in.readLine().split(" ");
        int n = Integer.parseInt(a[0]);
        int m = Integer.parseInt(a[1]);
        for (int i = 0; i < n; i++) {
            String[] scores = in.readLine().split(" ");
            int min = m + 1;
            int max = -1;
            int sum = 0;
            int cnt = 0;
            for (int j = 1; j < scores.length; j++) {
                int score = Integer.parseInt(scores[j]);
                if (score >= 0 && score <= m) {
                    max = Math.max(max, score);
                    min = Math.min(min, score);
                    sum += score;
                    cnt++;
                }
            }
            System.out.printf("%.0f", ((sum - max - min) / (cnt - 2) + Integer.parseInt(scores[0])) / 2.0);
            System.out.println();
        }

    }
}