import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        Set<String> tickets = new TreeSet<>(Comparator.reverseOrder());
        for (int i = 0; i < n; i++) {
            tickets.add(in.readLine());
        }
        int m = Integer.parseInt(in.readLine());
        Set<String> find = new HashSet<>();
        for (int i = 0; i < m; i++) {
            find.add(in.readLine());
        }
        tickets.removeAll(find);
        StringBuilder sb = new StringBuilder();
        for (String ticket : tickets) {
            sb.append(ticket).append("\n");
        }
        System.out.print(sb);
    }
}