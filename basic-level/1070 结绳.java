import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		in.nextToken();
		int n = (int) in.nval;
		int[] rope = new int[n];
		for (int i = 0; i < n; i++) {
			in.nextToken();
			rope[i] = (int) in.nval;
		}
		Arrays.sort(rope);
		double sum = rope[0] / 2.0 + rope[1] / 2.0;
		for (int i = 2; i < n; i++) {
			sum /= 2;
			sum += rope[i] / 2.0;
		}
		System.out.printf("%.0f",Math.floor(sum));
	}

}