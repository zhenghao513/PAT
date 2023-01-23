import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BigDecimal bigDecimal = new BigDecimal(in.readLine());
        System.out.println(bigDecimal.toPlainString());
    }
}