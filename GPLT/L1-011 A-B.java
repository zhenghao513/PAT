import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        char[] a = in.readLine().toCharArray();
        char[] b = in.readLine().toCharArray();
        StringBuilder sb = new StringBuilder();
        int[] book = new int[128];
        for (char c : b) {
            book[c] = 1;
        }
        for (char c : a) {
            if (book[c] != 1) sb.append(c);
        }
        System.out.println(sb);
    }
}