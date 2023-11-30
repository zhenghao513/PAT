import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        char[] offer = in.readLine().toCharArray();
        char[] need = in.readLine().toCharArray();
        int[] book = new int[128];
        for (int i = 0; i < offer.length; i++) {
            book[offer[i]]++;
        }
        int lose = 0, rest = offer.length;
        for (int i = 0; i < need.length; i++) {
            if (book[need[i]] == 0) {
                lose++;
            } else {
                book[need[i]]--;
                rest--;
            }
        }
        if (lose > 0) {
            System.out.printf("No %d", lose);
        } else if (rest >= 0) {
            System.out.printf("Yes %d", rest);
        }
    }
}