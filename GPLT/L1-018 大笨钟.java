import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] input = in.readLine().split(":");
        int hour = Integer.parseInt(input[0]);
        int minute = Integer.parseInt(input[1]);
        int h = hour - 12;
        StringBuilder sb = new StringBuilder();
        if (h > 0) {
            for (int i = 0; i < h; i++) {
                sb.append("Dang");
            }
            if (minute > 0) sb.append("Dang");
            System.out.println(sb);
        } else {
            System.out.printf("Only %02d:%02d.  Too early to Dang.", hour, minute);
        }
    }
}