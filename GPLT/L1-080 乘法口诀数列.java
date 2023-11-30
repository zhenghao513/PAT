import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] input = in.readLine().split(" ");
        int[] num = new int[1001];
        num[1] = Integer.parseInt(input[0]);
        num[2] = Integer.parseInt(input[1]);
        int n = Integer.parseInt(input[2]);
        int index = 2;
        for (int i = 3; i <= n; i++) {
            int temp = num[index] * num[index - 1];
            index++;
            if (temp < 10) num[i] = temp;
            else {
                char[] chars = Integer.toString(temp).toCharArray();
                for (char aChar : chars) {
                    num[i++] = aChar - '0';
                }
                i--;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (i > 1) sb.append(" ");
            sb.append(num[i]);
        }
        System.out.println(sb);
    }
}