import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		in.nextToken();
		double n = in.nval;
		in.nextToken();
		double e = in.nval;
		in.nextToken();
		int d = (int) in.nval;
		int maybe = 0, must = 0;
		for (int i = 0; i < n; i++) {
			in.nextToken();
			int k = (int) in.nval;
			int cnt = 0;
			for (int j = 0; j < k; j++) {
				in.nextToken();
				double x = in.nval;
				if (x < e) {
					cnt++;
				}
			}
			if (cnt > k / 2 && k > d) {
				must++;
			} else if (cnt > k / 2) {
				maybe++;
			}
		}
		System.out.printf("%.1f%% %.1f%%", maybe / n * 100, must / n * 100);
	}

}