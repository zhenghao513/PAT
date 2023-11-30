import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] numbers = new int[n];
        int number = 0;
        for (int i=0;i<numbers.length;i++)
        {
            numbers[i] = in.nextInt();
        }
        for (int i=0;i<numbers.length;i++)
        {
            for (int j=0;j<numbers.length;j++)
            {
                if (j==i)
                {
                    continue;
                }
                number =number + numbers[i] * 10 + numbers[j];
            }
        }
        System.out.println(number);
    }
}