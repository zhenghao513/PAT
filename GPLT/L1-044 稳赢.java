import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        String s = in.readLine();
        int index = 0;
        StringBuilder sb = new StringBuilder();
        while (!s.equals("End")) {
            index++;
            if (index % (n + 1) == 0) {
                sb.append(s).append("\n");
            } else {
                switch (s) {
                    case "JianDao":
                        sb.append("ChuiZi\n");
                        break;
                    case "ChuiZi":
                        sb.append("Bu\n");
                        break;
                    case "Bu":
                        sb.append("JianDao\n");
                        break;
                }
            }
            s = in.readLine();
        }
        System.out.print(sb);
    }
}