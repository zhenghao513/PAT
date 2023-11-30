import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        int[] team = new int[1001];
        for (int i = 0; i < n; i++) {
            String[] input = in.readLine().split("[ -]");
            int num = Integer.parseInt(input[0]);
            int score = Integer.parseInt(input[2]);
            team[num] += score;
        }
        int max = -1, index = -1;
        for (int i = 0; i < team.length; i++) {
            if (team[i] > max) {
                max = team[i];
                index = i;
            }
        }
        System.out.printf("%d %d", index, max);
    }
}