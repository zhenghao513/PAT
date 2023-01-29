import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s = in.readLine();
        List<String> list = new ArrayList<>();
        while (!s.equals(".")) {
            list.add(s);
            s = in.readLine();
        }
        int size = list.size();
        if (size < 2) System.out.println("Momo... No one is for you ...");
        else if (size < 13) System.out.printf("%s is the only one for you...", list.get(1));
        else System.out.printf("%s and %s are inviting you to dinner...", list.get(1), list.get(13));
    }
}