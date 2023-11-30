import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String[] sentence = in.readLine().split(", ");
            if (i > 0) sb.append("\n");
            if (sentence[0].endsWith("ong") && sentence[1].endsWith("ong.")) {
                String[] s = sentence[1].split(" ");
                sb.append(sentence[0]).append(", ");
                for (int j = 0; j < s.length - 3; j++) {
                    sb.append(s[j]).append(" ");
                }
                sb.append("qiao ben zhong.");
            }else {
                sb.append("Skipped");
            }
        }
        System.out.println(sb);
    }
}