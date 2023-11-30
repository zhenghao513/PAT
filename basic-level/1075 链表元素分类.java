import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        in.nextToken();
        int[] list = new int[100001];
        int[] data = new int[100001];
        int[] next = new int[100001];
        int first = (int) in.nval;
        in.nextToken();
        int n = (int) in.nval;
        in.nextToken();
        int k = (int) in.nval;
        for (int i = 0; i < n; i++) {
            in.nextToken();
            int address = (int) in.nval;
            in.nextToken();
            data[address] = (int) in.nval;
            in.nextToken();
            next[address] = (int) in.nval;
        }
        int sum = 0;
        while (first != -1) {
            list[sum++] = first;
            first = next[first];
        }
        List<Integer> list1 = new LinkedList<>();
        int index1 = 0, s = 0;
        for (int i = 0; i < sum; i++) {
            if (data[list[i]] < 0) {
                list1.add(index1++, list[i]);
            } else if (data[list[i]] <= k) {
                list1.add(index1 + s, list[i]);
                s++;
            } else {
                list1.add(list[i]);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sum - 1; i++) {
            sb.append(String.format("%05d %d %05d\n", list1.get(i), data[list1.get(i)], list1.get(i + 1)));
        }
        sb.append(String.format("%05d %d -1", list1.get(sum - 1), data[list1.get(sum - 1)]));
        System.out.print(sb);
    }
}