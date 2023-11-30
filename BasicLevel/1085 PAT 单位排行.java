import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		Map<String, Integer> map = new HashMap<String, Integer>();
		Map<String, Integer> join = new HashMap<String, Integer>();
		for (int i = 0; i < N; i++) {
			String[] data = in.readLine().toLowerCase().split(" ");
			char level = data[0].charAt(0);
			int score = Integer.parseInt(data[1]);
			String school = data[2];
			join.computeIfAbsent(school, k -> 0);
			join.compute(school, (k, v) -> {
				return ++v;
			});
			map.computeIfAbsent(school, k -> 0);
			if (level == 'a') {
				map.compute(school, (k, v) -> {
					return v += score;
				});
			} else if (level == 'b') {
				map.compute(school, (k, v) -> {
					return v += (int) (score / 1.5);
				});
			} else if (level == 't') {
				map.compute(school, (k, v) -> {
					return v += (int) (score * 1.5);
				});
			}
		}
		in.close();
		List<Test> list = new ArrayList<Test>();
		for (String s : join.keySet()) {
			list.add(new Test(s, map.get(s), join.get(s)));
		}
		list.sort(null);
		System.out.println(join.size());
		int curs = list.get(0).score;
		int rank = 1;
		int cnt = 0;
		for (Test test : list) {
			cnt++;
			if (test.score < curs) {
				curs = test.score;
				rank = cnt;
			}
			System.out.printf("%d %s %d %d\n", rank, test.school, test.score, test.join);
		}

	}

}

class Test implements Comparable<Test> {
	String school;
	int score;
	int join;

	public Test(String school, int score, int join) {
		this.school = school;
		this.score = score;
		this.join = join;
	}

	@Override
	public int compareTo(Test o) {
		int rule = o.score - this.score;
		if (rule == 0) {
			rule = this.join - o.join;
			if (rule == 0) {
				return this.school.compareTo(o.school);
			}
		}
		return rule;
	}

}