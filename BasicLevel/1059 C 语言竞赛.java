import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static boolean[] isPrime = new boolean[10001];

    static {
        Arrays.fill(isPrime, true);
        for (int i = 2; i < isPrime.length; i++) {
            if (isPrime[i]) {
                for (int k = 2; k * i < isPrime.length; k++) {
                    isPrime[k * i] = false;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        int len = n + 1;
        Map<String, Integer> map = new HashMap<>();
        for (int i = 1; i < len; i++) {
            map.put(in.readLine(), i);
        }
        int k = Integer.parseInt(in.readLine());
        StringBuilder sb = new StringBuilder();
        List<String> list = new LinkedList<>();
        for (int i = 1; i <= k; i++) {
            String s = in.readLine();
            if (list.contains(s) && map.get(s) != null) {
                sb.append(s).append(": Checked\n");
                continue;
            } else {
                list.add(s);
            }
            if (map.get(s) == null) {
                sb.append(s).append(": Are you kidding?\n");
            } else if (map.get(s) == 1) {
                sb.append(s).append(": Mystery Award\n");
            } else if (isPrime[map.get(s)]) {
                sb.append(s).append(": Minion\n");
            } else {
                sb.append(s).append(": Chocolate\n");
            }
        }
        System.out.print(sb);
    }
}