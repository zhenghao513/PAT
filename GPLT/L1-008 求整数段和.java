import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] input = in.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        StringBuilder sb = new StringBuilder();
        int index = 0, sum = 0;

        for (int i = a; i <= b; i++) {
            index++;
            sum += i;
            sb.append(String.format("% 5d", i));
            if (index % 5 == 0 && i != b) sb.append("\n");
        }
        System.out.printf("%s\nSum = %d", sb, sum);
    }
}