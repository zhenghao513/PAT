import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Score {
	public int gP, gMidTerm, gFinal;

	public Score(int gP, int gMidTerm, int gFinal) {
		super();
		this.gP = gP;
		this.gMidTerm = gMidTerm;
		this.gFinal = gFinal;
	}

}

class Student implements Comparable<Student> {
	public int gP, gMidTerm, gFinal, sum;
	public String name;

	public Student(int gP, int gMidTerm, int gFinal, int sum, String name) {
		super();
		this.gP = gP;
		this.gMidTerm = gMidTerm;
		this.gFinal = gFinal;
		this.sum = sum;
		this.name = name;
	}

	@Override
	public int compareTo(Student o) {
		int r = o.sum - this.sum;
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
		int p = Integer.parseInt(arr[0]);
		int m = Integer.parseInt(arr[1]);
		int n = Integer.parseInt(arr[2]);
		Map<String, Score> map = new HashMap<String, Score>();
		for (int i = 0; i < p; i++) {
			String[] a = in.readLine().split(" ");
			String name = a[0];
			int score = Integer.parseInt(a[1]);
			map.put(name, new Score(score, -1, -1));
		}
		for (int i = 0; i < m; i++) {
			String[] a = in.readLine().split(" ");
			String name = a[0];
			int score = Integer.parseInt(a[1]);
			if (map.containsKey(name)) {
				map.compute(name, (key, value) -> {
					value.gMidTerm = score;
					return value;
				});
			} else {
				map.put(name, new Score(-1, score, -1));
			}
		}
		for (int i = 0; i < n; i++) {
			String[] a = in.readLine().split(" ");
			String name = a[0];
			int score = Integer.parseInt(a[1]);
			if (map.containsKey(name)) {
				map.compute(name, (key, value) -> {
					value.gFinal = score;
					return value;
				});
			} else {
				map.put(name, new Score(-1, -1, score));
			}
		}
		in.close();
		List<Student> list = new ArrayList<Student>();
		for (String s : map.keySet()) {
			int gP = map.get(s).gP;
			int gMidTerm = map.get(s).gMidTerm;
			int gFinal = map.get(s).gFinal;
			if (gP >= -1 && gP <= 900 && gMidTerm >= -1 && gMidTerm <= 100 && gFinal >= -1 && gFinal <= 100) {
				double G = 0;
				if (gMidTerm > gFinal) {
					G = gMidTerm * 0.4 + gFinal * 0.6;
				} else {
					G = gFinal;
				}
				if (G >= 60 && gP >= 200) {
					list.add(new Student(gP, gMidTerm, gFinal, (int) Math.round(G), s));
				}
			}
		}
		map.clear();
		Collections.sort(list);
		for (Student s : list) {
			System.out.printf("%s %d %d %d %d\n", s.name, s.gP, s.gMidTerm, s.gFinal, s.sum);
		}
		list.clear();
	}

}
