import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        StringBuilder sb = new StringBuilder();
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int pang = 0;
            for (int j = 0; j < m; j++) pang = Math.max(pang, in.nextInt());
            sb.append(pang);
            if (i < n - 1) sb.append(" ");
            ans[i] = pang;
        }
        Arrays.sort(ans);
        sb.append("\n").append(ans[ans.length - 1]);
        System.out.println(sb);
    }
}