import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        in.nextToken();
        int n = (int) in.nval;
        in.nextToken();
        int k = (int) in.nval;
        in.nextToken();
        int m = (int) in.nval;
        double[] score = new double[n];
        for (int i = 0; i < n; i++) {
            int sum = 0, min = 100, max = 0;
            for (int j = 0; j < k; j++) {
                in.nextToken();
                int num = (int) in.nval;
                sum += num;
                max = Math.max(max, num);
                min = Math.min(min, num);
            }
            sum = sum - max - min;
            score[i] = (double) sum / (k - 2);
        }
        Arrays.sort(score);
        StringBuilder sb = new StringBuilder();
        for (int i = score.length - m; i < score.length; i++) {
            sb.append(String.format("%.3f", score[i]));
            if (i < score.length - 1) sb.append(" ");
        }
        System.out.println(sb);
    }
}