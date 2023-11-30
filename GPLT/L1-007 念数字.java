import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = in.readLine().toCharArray();
        StringBuilder sb = new StringBuilder();
        String[] strings = {"ling", "yi", "er", "san", "si", "wu", "liu", "qi", "ba", "jiu"};
        for (int i = 0; i < chars.length; i++) {
            if (i>0)sb.append(" ");
            if (chars[i] == '-') sb.append("fu");
            else sb.append(strings[chars[i] - '0']);
        }
        System.out.println(sb);
    }
}