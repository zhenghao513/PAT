import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            String[][] a = new String[n][3];
            in.nextLine();
            for (int i = 0; i < n; i++) {
                a[i] = in.nextLine().split(" ");
            }
            HashMap<String, String> kaoshi = new HashMap<String, String>();
            for (int i = 0; i < a.length; i++) {
                kaoshi.put(a[i][1], a[i][0] + " " + a[i][2]);
            }
            int m = in.nextInt();
            for (int i = 0; i < m; i++) {
                String s = in.next();
                System.out.println(kaoshi.get(s));
            }
        }
    }
}