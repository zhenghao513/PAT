import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    static StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));

    static int nextInt() throws IOException {
        in.nextToken();
        return (int) in.nval;
    }

    static StringBuilder sb = new StringBuilder();

    static void f(List<Person> list) {
        for (Person person : list) {
            sb.append(person.num).append(" ").append(person.dScore).append(" ").append(person.cScore).append("\n");
        }
    }

    public static void main(String[] args) throws IOException {
        int N = nextInt();
        int L = nextInt();
        int H = nextInt();
        List<Person> one = new ArrayList<>();
        List<Person> two = new ArrayList<>();
        List<Person> three = new ArrayList<>();
        List<Person> four = new ArrayList<>();
        int m = 0;
        for (int i = 0; i < N; i++) {
            int num = nextInt();
            int dScore = nextInt();
            int cScore = nextInt();
            if (dScore >= L && cScore >= L) {
                m++;
                if (dScore >= H && cScore >= H) {
                    one.add(new Person(num, dScore, cScore));
                } else if (dScore >= H) {
                    two.add(new Person(num, dScore, cScore));
                } else if (dScore >= cScore) {
                    three.add(new Person(num, dScore, cScore));
                } else {
                    four.add(new Person(num, dScore, cScore));
                }
            }
        }
        one.sort(null);
        two.sort(null);
        three.sort(null);
        four.sort(null);
        sb.append(m).append("\n");
        f(one);
        f(two);
        f(three);
        f(four);
        System.out.print(sb);
    }
}

class Person implements Comparable<Person> {
    int num;
    int dScore;
    int cScore;
    int score;

    public Person(int num, int dScore, int cScore) {
        this.num = num;
        this.dScore = dScore;
        this.cScore = cScore;
        this.score = dScore + cScore;
    }

    @Override
    public int compareTo(Person o) {
        int r = o.score - this.score;
        if (r == 0) r = o.dScore - this.dScore;
        if (r == 0) r = this.num - o.num;
        return r;
    }
}