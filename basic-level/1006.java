import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(in.readLine());
        int a = num / 100;
        int b = num / 10 % 10;
        int c = num % 10;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a; i++) {
            sb.append("B");
        }
        for (int i = 0; i < b; i++) {
            sb.append("S");
        }
        for (int i = 1; i <= c; i++) {
            sb.append(i);
        }
        System.out.println(sb);
    }
}