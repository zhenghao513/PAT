import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        in.nextLine();
        String[] a = in.nextLine().split(" ");
        String[][] stu = new String[n][];
        for (int i = 0; i < stu.length; i++) {
            stu[i] = in.nextLine().split(" ");
        }
//        for (int i = 0; i < stu.length; i++) {
//            for (int j = 0; j < stu[i].length; j++) {
//                System.out.print(stu[i][j] + " ");
//            }
//            System.out.println();
//        }
        int cnt = 0;
        int wp = 0;
        for (String[] strings : stu) {
            StringBuilder sb = new StringBuilder();
            boolean f = false;
            for (int j = 1; j < strings.length; j++) {
                for (int k = 0; k < a.length; k++) {
                    if (strings[j].equals(a[k])) {
                        f = true;
                        wp++;
                        sb.append(a[k]).append(" ");
                    }
                }
            }
            if (f) {
                cnt++;
                System.out.println(sb.insert(0, strings[0] + ": ").toString().trim());
            }
        }
        System.out.println(cnt + " " + wp);
    }
}