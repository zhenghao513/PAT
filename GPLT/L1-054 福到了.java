import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] input = in.readLine().split(" ");
        String s = input[0];
        int n = Integer.parseInt(input[1]);
        char[][] shape = new char[n][n];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String t = in.readLine();
            for (int j = 0; j < n; j++) {
                char c = t.charAt(j);
                shape[i][j] = c;
                sb.append(c);
            }
            if (i != n - 1) sb.append("\n");
        }
        StringBuilder fall = new StringBuilder();
        for (int i = n - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                fall.append(shape[i][j]);
            }
            if (i != 0) fall.append("\n");
        }
        if (sb.toString().equals(fall.toString())) {
            System.out.println("bu yong dao le");
        }
        System.out.println(fall.toString().replace("@", s));
    }
}