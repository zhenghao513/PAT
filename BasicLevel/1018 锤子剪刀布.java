import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        in.nextToken();
        int n = (int) in.nval;
        int a = 0, b = 0, c = 0;
        int[] AX = new int[3];
        int[] BX = new int[3];
        for (int i = 0; i < n; i++) {
            in.nextToken();
            String x = in.sval;
            in.nextToken();
            String y = in.sval;
            if (x.equals(y))
                b++;
            else if (x.equals("C"))
                if (y.equals("J")) {
                    AX[1]++;
                    a++;
                } else {
                    c++;
                    BX[0]++;
                }
            else if (x.equals("B"))
                if (y.equals("J")) {
                    BX[2]++;
                    c++;
                } else {
                    a++;
                    AX[0]++;
                }
            else if (x.equals("J"))
                if (y.equals("C")) {
                    BX[1]++;
                    c++;
                } else {
                    a++;
                    AX[2]++;
                }
        }
        char[] names = new char[]{'B', 'C', 'J'};
        StringBuilder sb = new StringBuilder();
        int idxA = 0;
        int idxB = 0;
        for (int i = 0; i < AX.length; i++) {
            if (AX[i] > AX[idxA])
                idxA = i;
            if (BX[i] > BX[idxB])
                idxB = i;
        }
        sb.append(a).append(" ").append(b).append(" ").append(c).append("\n")
                .append(c).append(" ").append(b).append(" ").append(a).append("\n")
                .append(names[idxA]).append(" ").append(names[idxB]);
        System.out.println(sb.toString().trim());
    }
}