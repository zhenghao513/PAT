import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static String Zip(String s) {
		int len = s.length();
		char c = s.charAt(0);
		StringBuilder sb = new StringBuilder();
		int cnt = 0;
		for (int i = 0; i < len; i++) {
			if (s.charAt(i) == c) {
				cnt++;
			} else {
				sb.append(cnt > 1 ? cnt : "").append(c);
				cnt = 1;
				c = s.charAt(i);
			}
		}
		if (cnt > 0) {
			sb.append(cnt > 1 ? cnt : "").append(c);
		}
		return sb.toString();
	}

	public static String Unzip(String s) {
		int len = s.length();
		StringBuilder sb = new StringBuilder();
		int num = 0;
		for (int i = 0; i < len; i++) {
			char c = s.charAt(i);
			if (c >= '0' && c <= '9') {
				num = num * 10 + c - '0';
			} else {
				if (num == 0) {
					sb.append(c);
				}
				for (int j = 0; j < num; j++) {
					sb.append(c);
				}
				num = 0;
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String c = in.readLine();
		String s = in.readLine();
		if (c.equals("C")) {
			System.out.print(Zip(s));
		} else if (c.equals("D")) {
			System.out.print(Unzip(s));
		}
	}

}