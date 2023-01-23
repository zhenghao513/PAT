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
        int[] num = new int[10];
        for (int i = 0; i < num.length; i++) {
            num[i] = nextInt();
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < num.length; i++) {
            if (num[i] > 0) {
                sb.append(i);
                while (num[0] > 0) {
                    sb.append(0);
                    num[0]--;
                }
                for (int j = 1; j < num[i]; j++) {
                    sb.append(i);
                }
            }
        }
        System.out.println(sb);
    }
}