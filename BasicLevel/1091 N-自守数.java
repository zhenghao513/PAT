import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(in.readLine());
        String[] input = in.readLine().split(" ");
        label:
        for (int i = 0; i < input.length; i++) {
            int num = Integer.parseInt(input[i]);
            for (int j = 1; j < 10; j++) {
                int x = j * num * num;
                if (Integer.toString(x).endsWith(Integer.toString(num))) {
                    System.out.printf("%d %d\n", j, x);
                    continue label;
                }
            }
            System.out.println("No");

        }
    }
}