import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int K = in.nextInt();
        for (int i = 0; i < K; i++) {
            int n1 = in.nextInt();
            int b = in.nextInt();
            int t = in.nextInt();
            int n2 = in.nextInt();
            if (t > T) {
                System.out.println("Not enough tokens.  Total = " + T + ".");
            } else if (b == 0 && n2 < n1 || b == 1 && n2 > n1) {
                T = t + T;
                System.out.println("Win " + t + "!  Total = " + T + ".");
            } else if (b == 0 && n2 > n1 || b == 1 && n2 < n1) {
                T = T - t;
                System.out.println("Lose " + t + ".  Total = " + T + ".");
                if (T == 0) {
                    System.out.println("Game Over.");
                    break;
                }
            }
        }
    }
}