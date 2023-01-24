import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = in.readLine().toCharArray();
        int[] b = new int[10];
        for (char aChar : chars) {
            b[aChar - '0']++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < b.length; i++) {
            if (b[i] > 0) sb.append(i).append(":").append(b[i]).append("\n");
        }
        System.out.print(sb);
    }
}