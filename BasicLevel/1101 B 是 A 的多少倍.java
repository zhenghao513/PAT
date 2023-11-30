import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] input = in.readLine().split(" ");
        String a = input[0];
        int d = Integer.parseInt(input[1]);
        String right = a.substring(a.length() - d);
        String left = a.substring(0, a.length() - d);
        System.out.printf("%.2f", Double.parseDouble(right + left) / Double.parseDouble(a));

    }
}