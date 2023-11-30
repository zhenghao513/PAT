import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, flag = 0;
        while (in.hasNextInt()) {
            a = in.nextInt();
            b = in.nextInt();
            if (b != 0) {
                if (flag == 1) System.out.print(" ");
                System.out.printf("%d %d", a * b, b - 1);
                flag = 1;
            }
        }
        if (flag == 0) System.out.print("0 0");
    }
}