import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        char[] input = in.readLine().toUpperCase().toCharArray();
        char[] output = in.readLine().toUpperCase().toCharArray();
        StringBuilder sb = new StringBuilder();
        int[] book = new int[128];
        label:
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < output.length; j++) {
                if (output[j] == input[i]) continue label;
            }
            if (book[input[i]] != 1) {
                sb.append(input[i]);
                book[input[i]] = 1;
            }
        }
        System.out.println(sb);

    }
}