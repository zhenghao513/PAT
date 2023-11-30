import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] input = in.readLine().split(" ");
        for (int i = 0; i < input.length; i++) {
            if (input[i].equals("250")) {
                System.out.println(i + 1);
                return;
            }
        }
    }
}