import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		String[] a = in.readLine().split(" ");
		String[] aSort = Arrays.copyOf(a, a.length);
		Arrays.sort(aSort);
		StringBuilder sb = new StringBuilder();
		int cnout = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i].equals(aSort[i])) {
				sb.append(a[i]).append(" ");
				cnout++;
			}
		}
		System.out.println(cnout);
		System.out.println(sb.toString().trim());
	}

}
