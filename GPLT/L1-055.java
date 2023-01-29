import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] input = in.readLine().split(" ");
        int pa = Integer.parseInt(input[0]);
        int pb = Integer.parseInt(input[1]);
        input = in.readLine().split(" ");
        int a = 0;
        int b = 0;
        for (String s : input) {
            if (s.equals("0")) a++;
            else b++;
        }
        if (pa > pb) {
            if (a > 0) System.out.printf("The winner is a: %d + %d", pa, a);
            else if (b == 3) System.out.printf("The winner is b: %d + %d", pb, b);
        } else if (pb > pa) {
            if (b > 0) System.out.printf("The winner is b: %d + %d", pb, b);
            else if (a == 3) System.out.printf("The winner is a: %d + %d", pa, a);
        }
    }
}