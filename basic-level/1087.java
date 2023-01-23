import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        HashSet<Integer> res = new HashSet<Integer>();
        for (int i = 1; i <= n; i++) {
            res.add(i / 2 + i / 3 + i / 5);
        }
        System.out.println(res.size());
    }
}