import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = in.readLine().split(" ");
		int M = Integer.parseInt(arr[0]);
		int N = Integer.parseInt(arr[1]);
		int S = Integer.parseInt(arr[2]);
		String[] names = new String[M];
		for (int i = 0; i < M; i++) {
			names[i] = in.readLine();
		}
		in.close();
		Set<String> set = new HashSet<String>();
		StringBuffer sb = new StringBuffer();
		// 顺延后还是按照原先间隔中奖
		int j;
		for (int i = S - 1; i < M; i += N + (j - i)) {
			for (j = i; j < M; j++) {
				if (!set.contains(names[j])) {
					set.add(names[j]);
					sb.append(names[j]).append("\n");
					break;
				}
			}
		}
		System.out.print(set.size() == 0 ? "Keep going..." : sb);
	}

}