import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] input = in.readLine().split(" ");
        int L0 = Integer.parseInt(input[0]);
        int L1 = Integer.parseInt(input[1]);
        int L2 = Integer.parseInt(input[2]);
        int T = Integer.parseInt(input[3]);
        input = in.readLine().split(" ");
        int l0 = Integer.parseInt(input[0]);
        int l1 = Integer.parseInt(input[1]);
        int l2 = Integer.parseInt(input[2]);
        int D0 = L0 - l0;
        int D1 = L1 - l1;
        int D2 = L2 - l2;
        System.out.printf("Diff = %d, %d, %d\n", D0, D1, D2);
        if (Math.abs(D0) + Math.abs(D1) + Math.abs(D2) <= T) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}