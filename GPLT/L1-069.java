import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] input = in.readLine().split(" ");
        int[] tire = new int[4];
        int max = -1;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            tire[i] = Integer.parseInt(input[i]);
            max = Math.max(max, tire[i]);
        }
        int lowest = Integer.parseInt(input[4]), threshold = Integer.parseInt(input[5]);
        for (int i = 0; i < 4; i++) {
            if (tire[i] < lowest || Math.abs(tire[i] - max) > threshold) list.add(i + 1);
        }
        int size = list.size();
        if (size == 0) System.out.println("Normal");
        else if (size == 1) System.out.printf("Warning: please check #%d!", list.get(0));
        else System.out.println("Warning: please check all the tires!");
    }
}