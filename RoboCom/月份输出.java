import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        String[] m = {"", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        while (true) {
            if (n > 12 || n < 1) {
                System.out.println("?");
                break;
            } else {
                System.out.println(m[n]);
            }
            n = Integer.parseInt(in.readLine());
        }

    }
}