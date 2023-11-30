import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        int count = 0;
        int[] weight = {7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2};
        char[] m = {'1', '0', 'X', '9', '8', '7', '6', '5', '4', '3', '2'};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String id = in.readLine();
            if (!id.matches("\\d{1,17}(\\d|X)")) {
                sb.append(id).append("\n");
                count++;
            } else {
                char[] chars = id.toCharArray();
                int sum = 0;
                for (int j = 0; j < chars.length - 1; j++) {
                    sum += (chars[j] - '0') * weight[j];
                }
                if (m[sum % 11] != chars[17]) {
                    sb.append(id).append("\n");
                    count++;
                }
            }
        }
        if (count == 0) System.out.println("All passed");
        else System.out.print(sb);
    }
}