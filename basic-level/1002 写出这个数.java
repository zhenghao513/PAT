import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = in.readLine().toCharArray();
        int sum = 0;
        for (char aChar : chars) {
            sum += aChar - '0';
        }
        StringBuilder sb = new StringBuilder();
        String[] arr = {"ling", "yi", "er", "san", "si", "wu", "liu", "qi", "ba", "jiu"};
        while (sum != 0) {
            sb.insert(0, arr[sum % 10] + " ");
            sum /= 10;
        }
        System.out.println(sb.toString().trim());
    }
}