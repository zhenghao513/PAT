import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] input = in.readLine().split(" ");
        char[] a = input[0].toCharArray();
        char[] b = input[2].toCharArray();
        int da = Integer.parseInt(input[1]);
        int db = Integer.parseInt(input[3]);
        int pa = 0, pb = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] - '0' == da) pa = pa * 10 + da;
        }
        for (int i = b.length - 1; i >= 0; i--) {
            if (b[i] - '0' == db) pb = pb * 10 + db;
        }
        System.out.println(pa + pb);
    }
}