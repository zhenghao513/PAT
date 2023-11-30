import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        String s = in.readLine();
        int length = s.length();
        int size = (int) Math.ceil(length / (double) n);
        String[] sentence = new String[size];
        int index = 0;
        for (int i = 0; i < size; i++) {
            sentence[i] = s.substring(index, Math.min(index += n, length));
        }
        int t = sentence[sentence.length - 1].length();
        if (t < n) {
            StringBuilder sb = new StringBuilder(sentence[sentence.length - 1]);
            for (int i = 0; i < n - t; i++) {
                sb.append(" ");
            }
            sentence[sentence.length - 1] = sb.toString();
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i > 0) sb.append("\n");
            for (int j = sentence.length - 1; j >= 0; j--) {
                sb.append(sentence[j].charAt(i));
            }
        }
        System.out.println(sb);
    }
}