import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        String[] input = in.readLine().split(" ");
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for (String s : input) {
            int num = Integer.parseInt(s);
            while (num != 1) {
                if (num % 2 == 0) num /= 2;
                else num = (num * 3 + 1) / 2;
                set.add(num);
            }
        }
        for (String s : input) {
            int num = Integer.parseInt(s);
            if (!set.contains(num)) {
                list.add(num);
            }
        }
        list.sort((o1, o2) -> o2 - o1);
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) sb.append(" ");
            sb.append(list.get(i));
        }
        System.out.println(sb);
    }
}