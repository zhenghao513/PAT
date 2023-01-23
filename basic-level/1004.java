import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        int max = -1, min = 101;
        String maxName = "", minName = "";
        for (int i = 0; i < n; i++) {
            String[] input = in.readLine().split(" ");
            int score = Integer.parseInt(input[2]);
            if (score > max) {
                max = score;
                maxName = input[0] + " " + input[1];
            }
            if (score < min) {
                min = score;
                minName = input[0] + " " + input[1];
            }
        }
        System.out.printf("%s\n%s", maxName, minName);
    }
}