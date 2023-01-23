import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String pwd = in.next();
        int n = in.nextInt();
        in.nextLine();
        String res = in.nextLine();
        while (!res.equals("#") && n > 0) {
            if (res.equals(pwd)) {
                System.out.println("Welcome in");
                break;
            } else {
                n--;
                System.out.println("Wrong password: " + res);
                if (n == 0) {
                    System.out.println("Account locked");
                    break;
                }
            }
            res = in.nextLine();
        }
    }
}