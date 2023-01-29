import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s = in.readLine();
        int index = 0;
        List<Integer> list = new ArrayList<>();
        while (!s.equals(".")) {
            index++;
            if (s.contains("chi1 huo3 guo1")) list.add(index);
            s = in.readLine();
        }
        int size = list.size();
        if (size == 0) System.out.printf("%d\n%s", index, "-_-#");
        else System.out.printf("%d\n%d %d", index, list.get(0), size);
    }
}