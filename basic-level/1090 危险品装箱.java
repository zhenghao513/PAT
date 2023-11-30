import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = in.readLine().split(" ");
		int N = Integer.parseInt(arr[0]);
		int M = Integer.parseInt(arr[1]);
		Map<String, LinkedList<String>> map = new HashMap<String, LinkedList<String>>();
		for (int i = 0; i < N; i++) {
			String[] box = in.readLine().split(" ");
			map.computeIfAbsent(box[0], k -> new LinkedList<String>());
			map.get(box[0]).add(box[1]);
			map.computeIfAbsent(box[1], k -> new LinkedList<String>());
			map.get(box[1]).add(box[0]);
		}
		find: for (int i = 0; i < M; i++) {
			String[] search = in.readLine().split(" ");
			for (int j = 1; j < search.length; j++) {
				for (int j2 = 1; j2 < search.length; j2++) {
					if (j != j2 && map.containsKey(search[j]) && map.get(search[j]).contains(search[j2])) {
						System.out.println("No");
						continue find;
					}
				}
			}
			System.out.println("Yes");
		}
	}

}