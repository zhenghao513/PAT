import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] input = in.readLine().split(" ");
        int D = Integer.parseInt(input[1]);
        if (D == 10) {
            System.out.println(Integer.toString(Integer.parseInt(input[0]), 27).toUpperCase());
        } else {
            System.out.println(Integer.parseInt(input[0], 27));
        }
    }
}