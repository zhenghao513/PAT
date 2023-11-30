import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        List<Student> list = new ArrayList();
        for (int i = 0; i < n; i++) {
            String[] input = in.readLine().split(" ");
            list.add(new Student(input[0], input[1]));
        }
        StringBuilder sb = new StringBuilder();
        int count = n / 2;
        for (int i = 0; i < count; i++) {
            for (int j = list.size() - 1; j >= count; j--) {
                if (!list.get(j).sex.equals(list.get(i).sex)) {
                    sb.append(list.get(i).name).append(" ").append(list.get(j).name).append("\n");
                    list.remove(j);
                    break;
                }
            }
        }
        System.out.print(sb);
    }
}

class Student {
    String sex;
    String name;

    public Student(String sex, String name) {
        this.sex = sex;
        this.name = name;
    }
}