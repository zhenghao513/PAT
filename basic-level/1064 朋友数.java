import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.TreeSet;

public class Main {
	public static int getFriend(int num) {
		int sum = 0;
		while (num != 0) {
			sum += num % 10;
			num /= 10;
		}
		return sum;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		in.nextToken();
		int n = (int) in.nval;
		TreeSet<Integer> set = new TreeSet<>();
		for (int i = 0; i < n; i++) {
			in.nextToken();
			set.add(getFriend((int) in.nval));
		}
		System.out.println(set.size());
		StringBuilder sb = new StringBuilder();
		for (int i : set) {
			sb.append(i).append(" ");
		}
		System.out.println(sb.toString().trim());
	}

}