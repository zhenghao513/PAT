import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String s = in.next();
            int[] a = new int[10];
            for (int i = 0; i < s.length(); i++) {
                a[s.charAt(i) - '0']++;
            }
            for (int i = 0; i < 10; i++) {
                if (a[i] > 0)
                    System.out.println(i + ":" + a[i]);
            }
        }
    }
}