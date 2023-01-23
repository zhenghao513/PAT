import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

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
        for (int i = 0; i < (sum - sum % k); i += k) {
            int len = i + k;
            int cnt = 0;
            for (int j = i; j < (len - i) / 2 + i; j++) {
                list[j] = list[j] + list[len - 1 - cnt] - (list[len - 1 - cnt] = list[j]);
                cnt++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n - 1; i++) {
            sb.append(String.format("%05d %d %05d\n", list[i], data[list[i]], list[i + 1]));
        }
        sb.append(String.format("%05d %d -1", list[n - 1], data[list[n - 1]]));
        System.out.print(sb);
    }
}