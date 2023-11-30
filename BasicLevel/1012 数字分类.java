import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] input = in.readLine().split(" ");
        int a1 = 0, a2 = 0, a3 = 0, a5 = 0, temp = -1, cnt = 0, flag = 0;
        double a4 = 0;
        for (int i = 1; i < input.length; i++) {
            int num = Integer.parseInt(input[i]);
            if (num % 10 == 0) a1 += num;
            else if (num % 5 == 1) {
                // 交错求和结果可能是0，需要加标志判断
                flag = 1;
                temp *= -1;
                a2 += num * temp;
            } else if (num % 5 == 2) a3++;
            else if (num % 5 == 3) {
                cnt++;
                a4 += num;
            } else if (num % 5 == 4) {
                a5 = Math.max(a5, num);
            }
        }
        System.out.print(a1 > 0 ? a1 : "N");
        System.out.print(flag == 1 ? " " + a2 : " N");
        System.out.print(a3 > 0 ? " " + a3 : " N");
        System.out.print(cnt > 0 ? String.format(" %.1f", a4 / cnt) : " N");
        System.out.print(a5 > 0 ? " " + a5 : " N");
    }
}