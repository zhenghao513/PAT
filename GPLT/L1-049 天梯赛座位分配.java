import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static boolean check(int n) {
        return n > 0;
    }

    public static boolean checkAll(int[] array) {
        int count = 0;
        for (int i : array) {
            if (i > 0) count++;
        }
        return count == 1;
    }

    public static void main(String[] args) throws IOException {
        StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        in.nextToken();
        int n = (int) in.nval;
        int[] teams = new int[n];
        LinkedList[] seat = new LinkedList[n];
        for (int i = 0; i < n; i++) {
            in.nextToken();
            teams[i] = (int) in.nval * 10;
            seat[i] = new LinkedList<Integer>();
        }
        int num = 1;
        for (int i = 1; ; i++) {
            int index = (i - 1) % n;
            if (check(teams[index])) {
                seat[index].add(num);
                teams[index]--;
                num++;
            } else if (checkAll(teams)) {
                break;
            }
        }
        int k;
        for (k = 0; k < teams.length; k++) {
            if (teams[k] > 0) {
                break;
            }
        }
        num--;
        for (int i = 0; i < teams[k]; i++) {
            num += 2;
            seat[k].add(num);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < seat.length; i++) {
            sb.append("#").append(i + 1).append("\n");
            for (int j = 0; j < seat[i].size(); j++) {
                sb.append(seat[i].get(j));
                if ((j + 1) % 10 == 0) {
                    sb.append("\n");
                } else {
                    sb.append(" ");
                }
            }
        }
        System.out.print(sb);
    }
}