import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));

    static int nextInt() throws IOException {
        in.nextToken();
        return (int) in.nval;
    }

    public static void main(String[] args) throws IOException {
        int N = nextInt();
        int K = nextInt();
        int S = nextInt();
        List<Student> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int gplt = nextInt();
            int pat = nextInt();
            if (gplt >= 175) list.add(new Student(gplt, pat));
        }
        list.sort(null);
        int cnt = 0;
        for (int i = 0; i < K; i++) {
            int temp = 101;
            for (int j = list.size() - 1; j >= 0; j--) {
                Student student = list.get(j);
                if (temp != student.gplt) {
                    cnt++;
                    temp = student.gplt;
                    list.remove(j);
                } else if (student.pat >= S) {
                    cnt++;
                    list.remove(j);
                }
            }
        }
        System.out.println(cnt);
    }
}

class Student implements Comparable<Student> {
    int gplt;
    int pat;

    public Student(int gplt, int pat) {
        this.gplt = gplt;
        this.pat = pat;
    }

    @Override
    public int compareTo(Student o) {
        int r = o.gplt - this.gplt;
        if (r == 0) r = o.pat - this.pat;
        return r;
    }
}