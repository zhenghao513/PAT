import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.HashMap;
import java.util.Map;

public class Main {
	private static Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	static {
		int[] value = { 10000, 36, 720, 360, 80, 252, 108, 72, 54, 180, 72, 180, 119, 36, 306, 1080, 144, 1800, 3600 };
		for (int i = 6; i <= 24; i++) {
			map.put(i, value[i - 6]);
		}
	}

	public static void main(String[] args) throws IOException {
		StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		int[] book = new int[10];
		int[][] location = new int[3][3];
		int x1 = 0, y1 = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				in.nextToken();
				int num = (int) in.nval;
				location[i][j] = num;
				if (location[i][j] == 0) {
					x1 = i;
					y1 = j;
				}
				book[num] = 1;
			}
		}
		int visible = 0;
		for (int i = 1; i < book.length; i++) {
			if (book[i] == 0) {
				location[x1][y1] = i;
			}
		}
		for (int i = 0; i < 3; i++) {
			in.nextToken();
			int x = (int) in.nval;
			in.nextToken();
			int y = (int) in.nval;
			System.out.println(location[x - 1][y - 1]);
		}
		in.nextToken();
		int sum = 0;
		int n = (int) in.nval;
		if (n == 1) {
			for (int i = 0; i < 3; i++) {
				sum += location[0][i];
			}
		} else if (n == 2) {
			for (int i = 0; i < 3; i++) {
				sum += location[1][i];
			}
		} else if (n == 3) {
			for (int i = 0; i < 3; i++) {
				sum += location[2][i];
			}
		} else if (n == 4) {
			for (int i = 0; i < 3; i++) {
				sum += location[i][0];
			}
		} else if (n == 5) {
			for (int i = 0; i < 3; i++) {
				sum += location[i][1];
			}
		} else if (n == 6) {
			for (int i = 0; i < 3; i++) {
				sum += location[i][2];
			}
		} else if (n == 7) {
			for (int i = 0; i < 3; i++) {
				sum += location[i][i];
			}
		} else if (n == 8) {
			for (int i = 2; i >= 0; i--) {
				sum += location[Math.abs(i - 2)][i];
			}
		}
		System.out.println(map.get(sum));
	}

}