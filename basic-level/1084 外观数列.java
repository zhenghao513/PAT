import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String d = in.next();
		int n = in.nextInt();
		String[] s = new String[41];
		s[1] = d;
		s[2] = d + "1";
		if (n < 3) {
			System.out.println(s[n]);
		} else {
			for (int i = 3; i <= n; i++) {
				String x = s[i - 1];
				int len = x.length();
				int cnt = 0;
				StringBuilder sb = new StringBuilder();
				char c = x.charAt(0);
				for (int j = 0; j < len; j++) {
					if (c == x.charAt(j)) {
						cnt++;
					} else {
						sb.append(c).append(cnt);
						cnt = 1;
						c = x.charAt(j);
					}
				}
				if (cnt > 0) {
					sb.append(c).append(cnt);
					cnt = 0;
				}
				s[i] = sb.toString();
			}
			System.out.println(s[n]);
		}
	}

}