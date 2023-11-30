import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        in.nextToken();
        int n = (int) in.nval;
        int[] num = new int[100001];
        for (int i = 0; i < n; i++) {
            in.nextToken();
            int x = (int) in.nval;
            in.nextToken();
            int score = (int) in.nval;
            num[x] += score;
        }
        // 如果n=1，编号为1的值为0，从0开始计算就得到编号0最大
        int maxvalue = num[1], t = 1;
        for (int i = 2; i < num.length; i++) {
            if (num[i] > maxvalue) {
                maxvalue = num[i];
                t = i;
            }
        }
        System.out.printf("%d %d", t, maxvalue);
    }
}