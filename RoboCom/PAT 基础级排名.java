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
        int l = Integer.parseInt(input[1]);
        List<Rank> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            input = in.readLine().split(" ");
            int score = Integer.parseInt(input[1]);
            int L = 0;
            if (score <= 30) list.add(new Rank(input[0], 1, score, 30));
            else if (score <= 50) list.add(new Rank(input[0], 2, score, 50));
            else if (score <= 60) list.add(new Rank(input[0], 3, score, 60));
            else if (score <= 80) list.add(new Rank(input[0], 4, score, 80));
            else if (score <= 100) list.add(new Rank(input[0], 5, score, 100));
        }
        list.sort(null);
        int index = 1, cnt = 0, t = 0;
        Rank temp = list.get(0);
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Rank rank = list.get(i);
            if (rank.score == 0) {
                sb.append(rank.num);
            } else {
                sb.append(rank.num).append(" ").append(rank.L).append(" ").append(rank.score).append("/")
                        .append(rank.fullScore).append(" ");
                if (temp.score == rank.score && temp.L == rank.L) {
                    sb.append(index).append("/").append(n);
                    t++;
                } else if (temp.score != rank.score && temp.L == rank.L) {
                    index = t + 1;
                    sb.append(index).append("/").append(n);
                    t++;
                } else {
                    temp = list.get(i);
                    index = 1;
                    n -= t;
                    sb.append(index).append("/").append(n);
                    t = 1;
                }
            }
            cnt++;
            if (i < size - 1) sb.append("\n");
        }
        System.out.println(sb);
    }
}


class Rank implements Comparable<Rank> {
    String num;
    int L;
    int score;
    int fullScore;

    public Rank(String num, int l, int score, int fullScore) {
        this.num = num;
        L = l;
        this.score = score;
        this.fullScore = fullScore;
    }

    @Override
    public int compareTo(Rank o) {
        int r = o.score - this.score;
        if (r == 0) r = this.num.compareTo(o.num);
        return r;
    }
}