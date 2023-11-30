import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] number = new int[n + 4];
        number[1] = 2;
        number[2] = 0;
        number[3] = 1;
        number[4] = 9;
        for (int i = 5; i <= n; i++) {
            number[i] = (number[i - 1] + number[i - 2] + number[i - 3] + number[i - 4]) % 10;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(number[i]);
        }
        System.out.println(sb);
    }
}