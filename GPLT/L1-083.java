import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] input = in.readLine().split(" ");
        int noAge = Integer.parseInt(input[0]);
        int yesAge = Integer.parseInt(input[1]);
        int askAge1 = Integer.parseInt(input[2]);
        int askAge2 = Integer.parseInt(input[3]);
        if (askAge1 >= noAge && askAge2 >= noAge) {
            System.out.printf("%d-Y %d-Y\nhuan ying ru guan", askAge1, askAge2);
        } else if (askAge1 >= yesAge && askAge2 < noAge) {
            System.out.printf("%d-Y %d-Y\nqing 1 zhao gu hao 2", askAge1, askAge2);
        } else if (askAge1 < noAge && askAge2 >= yesAge) {
            System.out.printf("%d-Y %d-Y\nqing 2 zhao gu hao 1", askAge1, askAge2);
        } else if (askAge1 < noAge && askAge2 < noAge) {
            System.out.printf("%d-N %d-N\nzhang da zai lai ba", askAge1, askAge2);
        } else if (askAge1 >= noAge) {
            System.out.printf("%d-Y %d-N\n1: huan ying ru guan", askAge1, askAge2);
        } else {
            System.out.printf("%d-N %d-Y\n2: huan ying ru guan", askAge1, askAge2);
        }
    }
}