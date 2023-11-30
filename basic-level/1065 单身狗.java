import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		Map<String, String> map = new HashMap<String, String>();
		for (int i = 0; i < n; i++) {
			String[] a = in.readLine().split(" ");
			map.put(a[0], a[1]);
			map.put(a[1], a[0]);
		}
		int m = Integer.parseInt(in.readLine());
		String[] a = in.readLine().split(" ");
		Set<String> set = new HashSet<>();
		List<String> result = new LinkedList<>();
		for (int i = 0; i < m; i++) {
			set.add(a[i]);
		}
		for (int i = 0; i < m; i++) {
			String x = map.get(a[i]);
			if (!set.contains(x)) {
				result.add(a[i]);
			}
		}
		map.clear();
		Collections.sort(result);
		StringBuilder sb = new StringBuilder();
		for (String s : result) {
			sb.append(s).append(" ");
		}
		System.out.printf("%d\n%s", result.size(), sb.toString().trim());
	}

}