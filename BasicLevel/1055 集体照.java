import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class People implements Comparable<People> {
	public String name;
	public int height;

	public People(String name, int height) {
		super();
		this.name = name;
		this.height = height;
	}

	// 按身高降序排列，身高相同的按名字升序
	@Override
	public int compareTo(People o) {
		int r = o.height - this.height;
		if (r == 0) {
			return this.name.compareTo(o.name);
		}
		return r;
	}

}

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = in.readLine().split(" ");
		int n = Integer.parseInt(arr[0]);
		int k = Integer.parseInt(arr[1]);
		// 每排人数为 N/K（向下取整）翻译一下就是整除
		int row = n / k;
		// 多出来的人
		int mod = n % k;
		List<People> list = new ArrayList<People>();
		for (int i = 0; i < n; i++) {
			String[] array = in.readLine().split(" ");
			list.add(new People(array[0], Integer.parseInt(array[1])));
		}
		Collections.sort(list);
		for (int i = 0; i < row; i++) {
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < (i == 0 ? row + mod : row); j++) {
				// 先右后左交替入队
				if (j % 2 == 0) {
					sb.append(list.get(0).name).append(" ");
				} else {
					sb.insert(0, list.get(0).name + " ");
				}
				list.remove(0);
			}
			System.out.println(sb.toString().trim());
		}
	}

}