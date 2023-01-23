import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] input = in.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] x = in.readLine().split(" ");
            students.add(new Student(x[0], Integer.parseInt(x[1])));
        }
        String[][] points = new String[m + 1][];
        for (int i = 1; i <= m; i++) {
            int flag = 0;
            points[i] = in.readLine().split(" ");
            switch (points[i][0]) {
                case "1":
                    students.sort(null);
                    System.out.printf("Case %d: %s %s\n", i, points[i][0], points[i][1]);
                    for (Student s : students) {
                        if (s.num.startsWith(points[i][1].charAt(0) + "")) {
                            flag = 1;
                            System.out.printf("%s %d\n", s.num, s.score);
                        }
                    }
                    if (flag == 0) {
                        System.out.println("NA");
                    }
                    break;
                case "2":
                    int person = 0, totalScore = 0;
                    for (Student s : students) {
                        if (s.num.substring(1, 4).equals(points[i][1])) {
                            flag = 1;
                            person++;
                            totalScore += s.score;
                        }
                    }
                    System.out.printf("Case %d: %s %s\n", i, points[i][0], points[i][1]);
                    switch (flag) {
                        case 1:
                            System.out.printf("%d %d\n", person, totalScore);
                            break;
                        default:
                            System.out.println("NA");
                            break;
                    }

                    break;
                case "3":
                    System.out.printf("Case %d: %s %s\n", i, points[i][0], points[i][1]);
                    List<Type3> list = new ArrayList<>();
                    int[] classroom = new int[1000];
                    for (Student s : students) {
                        if (s.num.substring(4, 10).equals(points[i][1])) {
                            classroom[Integer.parseInt(s.num.substring(1, 4))]++;
                        }
                    }
                    for (int j = 0; j < classroom.length; j++) {
                        if (classroom[j] > 0) {
                            list.add(new Type3(j, classroom[j]));
                        }
                    }
                    list.sort(null);
                    for (Type3 t : list) {
                        flag = 1;
                        System.out.printf("%d %d\n", t.classroom, t.num);
                    }
                    if (flag == 0) {
                        System.out.println("NA");
                    }
                    break;
            }
        }
    }

}

class Student implements Comparable<Student> {
    String num;
    int score;

    public Student(String num, int score) {
        super();
        this.num = num;
        this.score = score;
    }

    @Override
    public int compareTo(Student o) {
        return o.score - this.score != 0 ? o.score - this.score : this.num.compareTo(o.num);
    }

}

class Type3 implements Comparable<Type3> {
    int classroom;
    int num;

    public Type3(int classroom, int num) {
        super();
        this.classroom = classroom;
        this.num = num;
    }

    @Override
    public int compareTo(Type3 o) {
        return o.num - this.num != 0 ? o.num - this.num : this.classroom - o.classroom;
    }

}