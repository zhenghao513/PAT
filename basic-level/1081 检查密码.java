import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        String[] a = new String[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = in.readLine();
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i].length() < 6) {
                System.out.println("Your password is tai duan le.");
            } else {
                int letter = 0;
                int digit = 0;
                int bug = 0;
                for (int k = 0; k < a[i].length(); k++) {
                    char c = a[i].charAt(k);
                    if (Character.isDigit(c)) {
                        digit++;
                    } else if (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z') {
                        letter++;
                    } else if (c != '.') {
                        bug++;
                    }
                }
                if (letter == 0) {
                    System.out.println("Your password needs zi mu.");
                } else if (digit == 0) {
                    System.out.println("Your password needs shu zi.");
                } else if (bug > 0) {
                    System.out.println("Your password is tai luan le.");
                } else if (letter > 0 && digit > 0 && bug == 0) System.out.println("Your password is wan mei.");
            }
        }

    }
}