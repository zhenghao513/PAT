import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class Main {
    static StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));

    static int nextInt() throws IOException {
        in.nextToken();
        return (int) in.nval;
    }

    public static void main(String[] args) throws IOException {
        int n = nextInt();
        long p = nextInt();
        long[] num = new long[n];
        for (int i = 0; i < n; i++) {
            num[i] = nextInt();
        }
        Arrays.sort(num);
        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = result + i; j < n; j++) {
                if (num[j] <= num[i] * p) {
                    result = Math.max(result, j - i + 1);
                } else break;
            }
        }
        System.out.println(result);
    }
}