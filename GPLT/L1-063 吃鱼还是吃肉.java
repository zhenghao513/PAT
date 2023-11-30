import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String[] input = in.readLine().split(" ");
            int height = Integer.parseInt(input[1]);
            int weight = Integer.parseInt(input[2]);
            if (i > 0) sb.append("\n");
            if (input[0].equals("1")) {
                if (height > 130) sb.append("ni li hai!");
                else if (height < 130) sb.append("duo chi yu!");
                else sb.append("wan mei!");
                sb.append(" ");
                if (weight > 27) sb.append("shao chi rou!");
                else if (weight < 27) sb.append("duo chi rou!");
                else sb.append("wan mei!");
            } else if (input[0].equals("0")) {
                if (height > 129) sb.append("ni li hai!");
                else if (height < 129) sb.append("duo chi yu!");
                else sb.append("wan mei!");
                sb.append(" ");
                if (weight > 25) sb.append("shao chi rou!");
                else if (weight < 25) sb.append("duo chi rou!");
                else sb.append("wan mei!");
            }
        }
        System.out.println(sb);
    }
}