import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        int[] like = new int[1001];
        for (int i = 0; i < n; i++) {
            String[] input = in.readLine().split(" ");
            for (int j = 1; j < input.length; j++) {
                like[Integer.parseInt(input[j])]++;
            }
        }
        int max = -1, index = -1;
        for (int i = 0; i < like.length; i++) {
            if (max <= like[i]) {
                max = like[i];
                index = i;
            }
        }
        System.out.printf("%d %d", index, max);
    }
}