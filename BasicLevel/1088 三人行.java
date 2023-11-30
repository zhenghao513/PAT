import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    public static double[] ans(int x, int y) {
        for (int a = 99; a >= 10; a--) {
            int b = (a % 10) * 10 + (a / 10);
            double c = Math.abs(a - b) / (double) x;
            if (c * y == b) {
                return new double[]{a, b, c};
            }

        }
        return new double[]{};
    }

    public static void print(int m, double x) {
        if (m < x) {
            System.out.printf(" %s", "Cong");
        } else if (m == x) {
            System.out.printf(" %s", "Ping");
        } else if (m > x) {
            System.out.printf(" %s", "Gai");
        }
    }

    public static void main(String[] args) throws IOException {
        StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        in.nextToken();
        // 你自己的能力值
        int m = (int) in.nval;
        in.nextToken();
        int x = (int) in.nval;
        in.nextToken();
        int y = (int) in.nval;
        double[] data = ans(x, y);
        if (data.length > 0) {
            System.out.print((int) data[0]);
            for (int i = 0; i < data.length; i++) {
                print(m, data[i]);
            }
        } else {
            System.out.println("No Solution");
        }

    }

}