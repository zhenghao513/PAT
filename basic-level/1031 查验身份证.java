import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        int[] z = {7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2};
        char[] m = {'1', '0', 'X', '9', '8', '7', '6', '5', '4', '3', '2'};
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            String s = in.readLine();
            if (!s.substring(0, 17).matches("\\d+")) {
                list.add(s);
                continue;
            }
            int len = s.length() - 1;
            int sum = 0;
            for (int j = 0; j < len; j++) {
                sum += (s.charAt(j) - '0') * z[j];
            }
            if (s.charAt(17) != m[sum % 11]) {
                list.add(s);
            }

        }
        if (list.size() > 0) {
            StringBuilder sb = new StringBuilder();
            for (String string : list) {
                sb.append(string).append("\n");
            }
            System.out.print(sb);
        } else {
            System.out.println("All passed");
        }
    }

}