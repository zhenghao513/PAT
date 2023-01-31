import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static boolean isPrime(int n) {
        if (n < 3) return n > 1;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static Map<Integer, Integer> map = new HashMap<>();
    private static Set<Integer> set = new HashSet<>();

    public static void check(int a, int b) {
        label:
        for (int i = a; i <= b; i++) {
            int iterate = i;
            int cnt = 0;
            Set<Integer> iterator = new HashSet<>();
            while (iterate != 1) {
                iterate = sumOfSquare(iterate);
                // 迭代重复就跳过
                if (!iterator.add(iterate)) {
                    continue label;
                }
                // 记录不重复的迭代
                set.add(iterate);
                cnt++;
            }
            map.put(i, cnt);
        }
    }

    public static int sumOfSquare(int n) {
        int sum = 0;
        while (n != 0) {
            sum += Math.pow(n % 10, 2);
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] input = in.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        check(a, b);
        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort(null);
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (Integer integer : list) {
            // 去除依附
            if (!set.contains(integer)) {
                int x = map.get(integer);
                sb.append(integer).append(" ").append(isPrime(integer) ? 2 * x : x).append("\n");
            }
        }
        System.out.print(sb.length() > 0 ? sb : "SAD");
    }
}