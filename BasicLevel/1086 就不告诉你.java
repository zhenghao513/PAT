import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        long Product = a * b;
        String s = "";
        String Product_new = String.valueOf(Product);
        for (int i=0;i<Product_new.length();i++)
        {
            long x = Product % 10;
            Product = Product / 10;
            s = s + String.valueOf(x);
        }
        System.out.println(Integer.parseInt(s));
    }
}