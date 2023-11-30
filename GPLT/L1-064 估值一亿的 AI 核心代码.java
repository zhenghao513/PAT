import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String s = in.readLine();
            char[] chars = s.toCharArray();
            sb.append(s).append("\n");
            for (int j = 0; j < chars.length; j++) {
                if (chars[j] >= 'A' && chars[j] <= 'Z' && chars[j] != 'I') chars[j] += 32;
            }
            s = String.valueOf(chars).trim();
            s = s.replaceAll(" {2,}", " ");
            s = s.replaceAll(" ([\\W_])", "$1");
            s = s.replaceAll("\\bcan you\\b", "A");
            s = s.replaceAll("\\bcould you\\b", "B");
            s = s.replaceAll("\\b(I|me)\\b", "C");
            s = s.replace("?", "!");
            s = s.replace("A", "I can");
            s = s.replace("B", "I could");
            s = s.replace("C", "you");
            sb.append("AI: ").append(s).append("\n");
        }
        System.out.print(sb);
    }
}