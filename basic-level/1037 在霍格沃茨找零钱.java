import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] input = in.readLine().split(" ");
        String[] P = input[0].split("\\.");
        String[] A = input[1].split("\\.");
        int p = Integer.parseInt(P[0]) * 17 * 29 + Integer.parseInt(P[1]) * 29 + Integer.parseInt(P[2]);
        int a = Integer.parseInt(A[0]) * 17 * 29 + Integer.parseInt(A[1]) * 29 + Integer.parseInt(A[2]);
        int result = a - p;
        if (result < 0) {
            result = -result;
            System.out.print("-");
        }
        int galleon = 0, sickle = 0, knut = 0;
        galleon = result / (17 * 29);
        sickle = result % (17 * 29) / 29;
        knut = result % (17 * 29) % 29;
        System.out.printf("%d.%d.%d", galleon, sickle, knut);
    }
}