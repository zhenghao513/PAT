import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {
	public static String reverse(String s) {
		StringBuilder sb = new StringBuilder();
		sb.append(s);
		return sb.reverse().toString();
	}

	public static boolean isPalindromic(String s) {
		int len = s.length();
		int end = len / 2;
		for (int i = 0; i < end; i++) {
			if (s.charAt(i) != s.charAt(len - i - 1)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String num = in.readLine();
		int cnt = 0;
		while (cnt < 10 && !isPalindromic(num)) {
			String x = reverse(num);
			BigInteger b1 = new BigInteger(num);
			BigInteger b2 = new BigInteger(reverse(num));
			BigInteger result = b1.add(b2);
			System.out.printf("%s + %s = ", num, x);
			System.out.println(result);
			num = result.toString();
			cnt++;
		}
		if (cnt >= 10)
			System.out.println("Not found in 10 iterations.");
		else {
			System.out.println(num + " is a palindromic number.");
		}
	}

}