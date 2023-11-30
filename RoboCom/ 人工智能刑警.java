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
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            input = in.readLine().split(" ");
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < m; j++) {
                sb.append(input[j]);
                if (j < m - 1) sb.append(" ");
            }
            map.put(sb.toString(), input[m]);
        }
        in.readLine();
        input = in.readLine().split(" ");
        while (!input[0].equals("0")) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < m; j++) {
                sb.append(input[j]);
                if (j < m - 1) sb.append(" ");
            }
            System.out.println(map.getOrDefault(sb.toString(), "Pass"));
            input = in.readLine().split(" ");
        }
    }
}