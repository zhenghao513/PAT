import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] input = in.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        String[] fullScore = in.readLine().split(" ");
        String[] answer = in.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            int sum = 0;
            String[] ans = in.readLine().split(" ");
            for (int j = 0; j < ans.length; j++) {
                if (ans[j].equals(answer[j])) sum += Integer.parseInt(fullScore[j]);
            }
            System.out.println(sum);
        }
    }
}