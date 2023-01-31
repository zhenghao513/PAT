import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

public class Main {
    static class Time implements Comparable<Time> {
        String start;
        String end;

        public Time(String start, String end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Time o) {
            return this.start.compareTo(o.start);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = parseInt(in.readLine());
        List<Time> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] input = in.readLine().split(" - ");
            list.add(new Time(input[0], input[1]));
        }
        in.close();
        list.sort(null);
        StringBuilder sb = new StringBuilder();
        if (!list.get(0).start.equals("00:00:00")) {
            sb.append("00:00:00 - ").append(list.get(0).start).append("\n");
        }
        int size = list.size();
        for (int i = 1; i < size; i++) {
            String e1 = list.get(i - 1).end;
            String s2 = list.get(i).start;
            if (!e1.equals(s2)) {
                sb.append(list.get(i - 1).end).append(" - ").append(list.get(i).start).append("\n");
            }
        }

        if (!list.get(size - 1).end.equals("23:59:59")) {
            sb.append(list.get(size - 1).end).append(" - 23:59:59");
        }
        System.out.print(sb);
    }
}

