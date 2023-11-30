import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        Set<String> out = new TreeSet<>();
        Set<String> back = new TreeSet<>();
        Set<String> outTemp = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            String s = in.readLine();
            out.add(s);
            outTemp.add(s);
        }
        int m = Integer.parseInt(in.readLine());
        for (int i = 0; i < m; i++) {
            String s = in.readLine();
            back.add(s);
        }
        out.removeAll(back);
        back.removeAll(outTemp);
        int size1 = out.size();
        int size2 = back.size();
        StringBuilder sb = new StringBuilder();
        if (size1 > 0) {
            sb.append("Missing: ").append(size1).append("\n");
            for (String s : out) {
                sb.append(s).append("\n");
            }
        } else {
            sb.append("All Back\n");
        }
        if (size2 > 0) {
            sb.append("New: ").append(size2).append("\n");
            for (String s : back) {
                sb.append(s).append("\n");
            }
        } else {
            sb.append("All Known\n");
        }
        System.out.print(sb);
    }
}