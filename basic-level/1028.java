import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        List<People> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] input = in.readLine().split(" ");
            if (input[1].compareTo("1814/09/06") >= 0 && input[1].compareTo("2014/09/06") <= 0) {
                list.add(new People(input[0], input[1]));
            }
        }
        list.sort(null);
        int size = list.size();
        if (size == 0) {
            System.out.println(0);
        } else {
            System.out.printf("%d %s %s", size, list.get(0).name, list.get(size - 1).name);
        }
    }
}

class People implements Comparable<People> {
    String name;
    String birth;

    public People(String name, String birth) {
        this.name = name;
        this.birth = birth;
    }

    @Override
    public int compareTo(People o) {
        return this.birth.compareTo(o.birth);
    }
}