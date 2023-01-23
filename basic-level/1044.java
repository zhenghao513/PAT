import java.util.Scanner;

public class Main {
    private static String[] martian = {"tret", "jan", "feb", "mar", "apr", "may", "jun",
            "jly", "aug", "sep", "oct", "nov", "dec"};
    private static String[] high_digits = {"", "tam", "hel", "maa", "huh", "tou", "kes", "hei", "elo",
            "syy", "lok", "mer", "jou"};

    public static String baseConversion(int n, int base) {
        if (n == 0) return "";
        return baseConversion(n / base, base) + (n % base) + " ";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        for (int i = 0; i < n; i++) {
            String s = in.nextLine();
            String[] a;
            StringBuilder sb = new StringBuilder();
            if (!Character.isDigit(s.charAt(0))) {
                a = s.split(" ");
                if (a.length == 1)
                    for (int k = 0; k < high_digits.length; k++) {
                        if (a[0].equals(high_digits[k]))
                            System.out.println((int) Math.pow(13, 1) * k);
                    }
                else {
                    for (int k = 0; k < a.length - 1; k++) {
                        for (int j = 0; j < high_digits.length; j++) {
                            if (a[k].equals(high_digits[j]))
                                sb.append(j).append(" ");
                        }
                    }
                    for (int j = 0; j < martian.length; j++) {
                        if (a[a.length - 1].equals(martian[j]))
                            sb.append(j);
                    }
                    String[] res = sb.toString().split(" ");
                    int power = res.length - 1;
                    int num = 0;
                    for (String re : res) {
                        num += (int) Math.pow(13, power) * Integer.parseInt(re);
                        power--;
                    }
                    System.out.println(num);
                }
            } else {
                a = baseConversion(Integer.parseInt(s), 13).split(" ");
                for (int k = 0; k < a.length - 1; k++) {
                    sb.append(high_digits[Integer.parseInt(a[k])]).append(" ");
                }
                sb.append(martian[Integer.parseInt(a[a.length - 1])]);
                System.out.println(sb);
            }
        }
    }
}