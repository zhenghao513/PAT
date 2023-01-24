import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        Set<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String[] input = in.readLine().split(" ");
            if (input.length > 2) {
                for (int j = 1; j < input.length; j++) set.add(input[j]);
            }
        }
        int m = Integer.parseInt(in.readLine());
        StringBuilder sb = new StringBuilder();
        String[] input = in.readLine().split(" ");
        in.close();
        for (String s : input) {
            if (!set.contains(s)) {
                sb.append(s).append(" ");
                set.add(s);
            }
        }
        if (sb.length() == 0) System.out.println("No one is handsome");
        else System.out.println(sb.toString().trim());
    }
}