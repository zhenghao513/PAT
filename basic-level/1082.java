import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        in.nextToken();
        int n = (int) in.nval;
        int[] id = new int[n];
        double[] score = new double[n];
        for (int i = 0; i < n; i++) {
            in.nextToken();
            id[i] = (int) in.nval;
            in.nextToken();
            int x = (int) in.nval;
            in.nextToken();
            int y = (int) in.nval;
            double res = Math.sqrt(Math.pow(Math.abs(x), 2) + Math.pow(Math.abs(y), 2));
            score[i] = res;
        }
        ArrayList<Double> a = new ArrayList<Double>();
        for (double v : score) {
            a.add(v);
        }
        Arrays.sort(score);
        System.out.printf("%04d %04d", id[a.indexOf(score[0])], id[a.indexOf(score[n - 1])]);
    }
}