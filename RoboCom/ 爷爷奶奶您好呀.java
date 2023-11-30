import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] input = in.readLine().split(" ");
        if (input[0].equals("F")) System.out.printf("%s NaiNai Nin Hao Ya ~", input[1]);
        else System.out.printf("%s YeYe Nin Hao Ya ~", input[1]);
    }
}