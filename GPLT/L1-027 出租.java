import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = in.readLine().toCharArray();
        int[] num = new int[10];
        for (char aChar : chars) {
            num[aChar - '0'] = 1;
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder arr = new StringBuilder("int[] arr = new int[]{");
        StringBuilder index = new StringBuilder("int[] index = new int[]{");
        for (int i = num.length - 1; i >= 0; i--) {
            if (num[i] == 1) {
                sb.append(i);
                arr.append(i).append(",");
            }
        }
        arr.replace(arr.length() - 1, arr.length(), "};");
        for (char aChar : chars) {
            index.append(sb.indexOf(String.valueOf(aChar))).append(",");
        }
        index.replace(index.length() - 1, index.length(), "};");
        System.out.printf("%s\n%s", arr, index);
    }
}