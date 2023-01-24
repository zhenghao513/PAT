import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        // 记录试机座位号对应的准考证号
        String[] admissionTicketNumber = new String[1001];
        // 记录试机座位号对应的考试座位号
        int[] seatNumber = new int[1001];
        for (int i = 0; i < n; i++) {
            String[] input = in.readLine().split(" ");
            // 试机座位号
            int seat = Integer.parseInt(input[1]);
            admissionTicketNumber[seat] = input[0];
            seatNumber[seat] = Integer.parseInt(input[2]);
        }
        int m = Integer.parseInt(in.readLine());
        String[] input = in.readLine().split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length; i++) {
            if (i > 0) sb.append("\n");
            // 试机座位号
            int seat = Integer.parseInt(input[i]);
            sb.append(admissionTicketNumber[seat]).append(" ").append(seatNumber[seat]);
        }
        System.out.println(sb);
    }
}