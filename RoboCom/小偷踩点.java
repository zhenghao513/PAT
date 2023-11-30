import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] input = in.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        String[] mark = new String[n + 1];
        for (int i = 1; i <= n; i++) {
            mark[i] = in.readLine();
        }
        input = in.readLine().split(" ");
        Map<String, Integer> map1 = new HashMap<>();
        for (int i = 1; i <= input.length; i++) {
            map1.put(input[i - 1], i);
        }
        String[][] map = new String[m + 1][n];
        for (int i = 1; i <= m; i++) {
            map[i] = in.readLine().split(" ");
        }
        input = in.readLine().split(" ");
        for (int i = 1; i < input.length; i++) {
            char[] c = input[i].toCharArray();
            int x = map1.getOrDefault(c[0] + "", -1);
            int y = c[1] - '0';
            if (x < 1 || x > m || y < 0 || y > n) {
                System.out.println("?");
            } else {
                int t = Integer.parseInt(map[x][y]);
                if (t < 1 || t > n) System.out.println("?");
                else System.out.println(mark[Integer.parseInt(map[x][y])]);
            }
        }

    }
}