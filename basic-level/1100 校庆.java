import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        Set<String> mate = new HashSet<>();
        for (int i = 0; i < n; i++) {
            mate.add(in.readLine());
        }
        int m = Integer.parseInt(in.readLine());
        int cnt = 0;
        String old, age = "20200101", oldId = "";
        for (int i = 0; i < m; i++) {
            String s = in.readLine();
            String birth = s.substring(6, 14);
            if (age.compareTo(birth) > 0) {
                age = birth;
                oldId = s;
            }
            if (mate.contains(s)) cnt++;
        }
        System.out.println(cnt);
        System.out.println(oldId);
    }
}