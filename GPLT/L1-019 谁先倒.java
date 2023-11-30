import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] input = in.readLine().split(" ");
        int first = Integer.parseInt(input[0]);
        int second = Integer.parseInt(input[1]);
        int c1 = 0, c2 = 0;
        int N = Integer.parseInt(in.readLine());
        for (int i = 0; i < N; i++) {
            input = in.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            int c = Integer.parseInt(input[2]);
            int d = Integer.parseInt(input[3]);
            if (b == d) continue;
            else if (a + c == b) c1++;
            else if (a + c == d) c2++;
            if (c1 > first) {
                System.out.printf("A\n%d", c2);
                break;
            } else if (c2 > second) {
                System.out.printf("B\n%d", c1);
                break;
            }
        }

    }
}