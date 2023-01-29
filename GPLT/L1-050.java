import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] input = in.readLine().split(" ");
        int L = Integer.parseInt(input[0]);
        int N = Integer.parseInt(input[1]);
        int len = (int) Math.pow(26, L);
        int count = len - N;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < L; i++) {
            sb.append((char) (97 + count % 26));
            count /= 26;
        }
        System.out.println(sb.reverse());
    }
}