import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static boolean isPrime(int n) {
        if (n < 3) return n > 1;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] input = in.readLine().split(" ");
        int m = Integer.parseInt(input[0]);
        int n = Integer.parseInt(input[1]);
        List<Integer> list = new ArrayList<>();
        int num = 2;
        while (list.size() < n) {
            if (isPrime(num)) {
                list.add(num);
            }
            num++;
        }
        int cnt = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = m; i <= n; i++) {
            sb.append(list.get(i - 1));
            sb.append(i == n ? "" : cnt % 10 == 0 ? "\n" : " ");
            cnt++;
        }
        System.out.println(sb);
    }
}