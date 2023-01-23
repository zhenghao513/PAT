import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    static StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));

    static int nextInt() throws IOException {
        in.nextToken();
        return (int) in.nval;
    }

    public static void main(String[] args) throws IOException {
        int n = nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = nextInt();
        }
        int abs = Math.abs(a[0] - b[0]);
        int maxvalue = abs, maxTop = a[0], maxBottom = b[0];
        int minvalue = abs, minTop = a[0], minBottom = b[0];
        for (int i = 1; i < n; i++) {
            int t = Math.abs(a[i] - b[i]);
            if (maxvalue < t) {
                maxvalue = t;
                maxTop = a[i];
                maxBottom = b[i];
            }
            if (minvalue > t) {
                minvalue = t;
                minTop = a[i];
                minBottom = b[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (a[i] < minTop || b[i] > minBottom) {
                System.out.printf("No %d", Math.abs(a[i] - b[i]));
                return;
            }
        }
        System.out.printf("Yes %d", minvalue);

    }
}