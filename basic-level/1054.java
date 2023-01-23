import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		String[] a = in.readLine().split(" ");
		double sum = 0;
		double X = 0;
		int K = 0;
		for (String s : a) {
			try {
				X = Double.parseDouble(s);
				String str = String.valueOf(X);
				if (X >= -1000 && X <= 1000 && str.substring(str.indexOf(".")).length() <= 3) {
					sum += X * 100;
					K++;
				} else
					System.out.println("ERROR: " + s + " is not a legal number");
			} catch (NumberFormatException e) {
				System.out.println("ERROR: " + s + " is not a legal number");
			}
		}
		if (K >= 1)
			System.out.println("The average of " + K + (K == 1 ? " number is " : " numbers is ")
					+ String.format("%.2f", sum / K / 100));
		else
			System.out.println("The average of " + K + " numbers is Undefined");
	}
}