import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = in.readLine().toLowerCase().toCharArray();
        int[] book = new int[26];
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                book[chars[i] - 'a']++;
            }
        }
        int max = book[0], t = 0;
        for (int i = 1; i < book.length; i++) {
            if (book[i] > max) {
                max = book[i];
                t = i;
            }
        }
        System.out.printf("%s %d", (char) ('a' + t), max);

    }
}