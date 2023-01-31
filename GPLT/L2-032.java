import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] input = in.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int k = Integer.parseInt(input[2]);
        StringBuilder sb = new StringBuilder();
        label:
        for (int i = 0; i < k; i++) {
            input = in.readLine().split(" ");
            Deque<Integer> queue = new ArrayDeque<>();
            Deque<Integer> st = new ArrayDeque<>();
            int need = 1;
            for (String s : input) {
                int num = Integer.parseInt(s);
                if (num == need) {
                    queue.offer(num);
                    need++;
                    while (!st.isEmpty() && st.peek() == need) {
                        queue.offer(st.pop());
                        need++;
                    }
                } else {
                    if (st.size() == m) {
                        sb.append("NO\n");
                        continue label;
                    }
                    st.push(num);
                }
            }
            while (!st.isEmpty()) {
                queue.offer(st.pop());
            }
            for (int j = 1; j <= n; j++) {
                if (!queue.isEmpty() && queue.poll() != j) {
                    sb.append("NO\n");
                    continue label;
                }
            }
            sb.append("YES\n");
        }
        System.out.print(sb);
    }
}