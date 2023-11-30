import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        StringBuilder sb = new StringBuilder();
        List<Person> list = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            String[] input = in.readLine().split(" ");
            int num = Integer.parseInt(input[1]);
            sum += num;
            list.add(new Person(input[0], num));
        }
        double avg = sum / (double) n / 2;
        double abs = Math.abs(list.get(0).num - avg);
        String name = list.get(0).name;
        for (int i = 1; i < list.size(); i++) {
            double temp = Math.abs(list.get(i).num - avg);
            if (abs > temp) {
                abs = temp;
                name = list.get(i).name;
            }
        }
        System.out.printf("%d %s", (int) avg, name);

    }
}

class Person {
    String name;
    int num;

    public Person(String name, int num) {
        this.name = name;
        this.num = num;
    }
}