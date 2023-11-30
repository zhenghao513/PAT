import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Main {

    public static String computer(int m, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = m; i <= n; i++) {
            double x = sqrt(pow(i, 3) - pow(i - 1, 3));
            if (x % 1 == 0) {
                for (int j = 1; j < i; j++) {
                    if (x == pow(j, 2) + pow(j - 1, 2)) {
                        sb.append(i).append(" ").append(j).append("\n");
                    }
                }
            }
        }
        if (sb.length() > 0)
            return sb.toString();
        else return "No Solution";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        System.out.print(computer(m, n));
    }
}