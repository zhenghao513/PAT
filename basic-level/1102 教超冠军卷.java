import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        int m1 = -1, m2 = -1;
        String k1 = "", k2 = "";
        for (int i = 0; i < n; i++) {
            String[] arr = in.readLine().split(" ");
            String id = arr[0];
            int price = Integer.parseInt(arr[1]);
            int sale = Integer.parseInt(arr[2]);
            int total = price * sale;
            if (sale > m1) {
                m1 = sale;
                k1 = id;
            }
            if (total > m2) {
                m2 = total;
                k2 = id;
            }
        }
        System.out.println(k1 + " " + m1);
        System.out.println(k2 + " " + m2);
    }
}