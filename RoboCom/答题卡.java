import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] input = in.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int[][] code = new int[n + 1][n + 1];
        for (int i = 0; i < m; i++) {
            String s = in.readLine();
            if (s.matches("\\d+")) {
                s = String.format("%04d", Integer.parseInt(s));
                int length = s.length() / 2;
                int x = Integer.parseInt(s.substring(0, length));
                int y = Integer.parseInt(s.substring(length));
                code[n + 1 - y][x] = 1;
            } else {
                String[] x = s.split("\\W");
                code[n + 1 - Integer.parseInt(x[1])][Integer.parseInt(x[0])] = 1;
            }
        }
        for (int i = 1; i < code.length; i++) {
            for (int j = 1; j < code[i].length; j++) {
                if (code[i][j] == 1) {
                    System.out.print("#");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }
}