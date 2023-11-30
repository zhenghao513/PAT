import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[][] password = new String[n][4];
        for (int i=0;i<password.length;i++)
        {
            for (int j=0;j<password[i].length;j++)
            {
                password[i][j] = in.next();
            }
        }
        String pass = "";
        for (int i=0;i<password.length;i++)
        {
            for (int j=0;j<password[i].length;j++)
            {
                if (password[i][j].endsWith("T"))
                {
                    pass = pass + password[i][j].charAt(0);
                }
            }
        }
        for (int i=0;i<pass.length();i++)
        {
            switch (pass.charAt(i)){
                case 'A':
                    System.out.print("1");
                    break;
                case 'B':
                    System.out.print("2");
                    break;
                case 'C':
                    System.out.print("3");
                    break;
                case 'D':
                    System.out.print("4");
                    break;
            }
        }
    }
}