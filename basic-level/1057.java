import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s = in.readLine().toLowerCase();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z')
                sum += (int) c - 96;
        }
        String a = Integer.toBinaryString(sum);
        char[] c = a.toCharArray();
        Arrays.sort(c);
        a = new String(c);
        int idx = a.indexOf('1');
        if (idx == -1) idx = 0;
        if (a.equals("0")) System.out.println(0 + " " + 0);
        else System.out.print(idx + " " + (a.length() - idx));

    }
}