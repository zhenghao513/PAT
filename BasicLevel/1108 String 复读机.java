import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int[] symbol = new int[6];
        int count = s.length();
        for (int i = 0; i < count; i++) {
            char c = s.charAt(i);
            switch (c) {
                case 'S':
                    symbol[0]++;
                    break;
                case 't':
                    symbol[1]++;
                    break;
                case 'r':
                    symbol[2]++;
                    break;
                case 'i':
                    symbol[3]++;
                    break;
                case 'n':
                    symbol[4]++;
                    break;
                case 'g':
                    symbol[5]++;
                    break;
            }
        }
        StringBuilder sb = new StringBuilder();
        while (symbol[0] != 0 || symbol[1] != 0 || symbol[2] != 0 || symbol[3] != 0 || symbol[4] != 0 || symbol[5] != 0) {
            if (symbol[0] > 0) {
                sb.append("S");
                symbol[0]--;
            }
            if (symbol[1] > 0) {
                sb.append("t");
                symbol[1]--;
            }
            if (symbol[2] > 0) {
                sb.append("r");
                symbol[2]--;
            }
            if (symbol[3] > 0) {
                sb.append("i");
                symbol[3]--;
            }
            if (symbol[4] > 0) {
                sb.append("n");
                symbol[4]--;
            }
            if (symbol[5] > 0) {
                sb.append("g");
                symbol[5]--;
            }
        }
        System.out.println(sb);
    }
}