import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] input = in.readLine().split(" ");
        int[] num = new int[24];
        for (int i = 0; i < input.length; i++) {
            num[i] = Integer.parseInt(input[i]);
        }
        int id = Integer.parseInt(in.readLine());
        StringBuilder sb = new StringBuilder();
        while (id >= 0 && id <= 23) {
            if (num[id] > 50) sb.append(num[id]).append(" Yes\n");
            else sb.append(num[id]).append(" No\n");
            id = Integer.parseInt(in.readLine());
        }
        System.out.print(sb);
    }
}