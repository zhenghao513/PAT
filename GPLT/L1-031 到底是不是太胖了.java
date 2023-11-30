import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = parseInt(in.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String[] input = in.readLine().split(" ");
            int h = parseInt(input[0]);
            int w = parseInt(input[1]);
            if (i > 0) sb.append("\n");
            double normal = (h - 100) * 1.8;
            if (Math.abs(w - normal) < normal * 0.1) sb.append("You are wan mei!");
            else if (w < normal) sb.append("You are tai shou le!");
            else if (w > normal) sb.append("You are tai pang le!");
        }
        System.out.println(sb);
    }
}