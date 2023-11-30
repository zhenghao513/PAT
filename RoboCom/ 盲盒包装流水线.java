import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] input = in.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int s = Integer.parseInt(input[1]);
        String[] num = in.readLine().split(" ");
        Deque<String> deque = new ArrayDeque<>();
        for (String s1 : num) {
            deque.offer(s1);
        }
        int len = n / s;
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            String[] temp = in.readLine().split(" ");
            for (int j = temp.length - 1; j >= 0; j--) {
                if (!deque.isEmpty()) {
                    map.put(deque.poll(), temp[j]);
                }
            }

        }
        int k = Integer.parseInt(in.readLine());
        for (int i = 0; i < k; i++) {
            String s1 = in.readLine();
            System.out.println(map.getOrDefault(s1, "Wrong Number"));
        }
    }
}