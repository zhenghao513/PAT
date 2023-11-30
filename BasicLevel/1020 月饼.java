import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		in.nextToken();
		int N = (int) in.nval;
		in.nextToken();
		int D = (int) in.nval;
		double[] amout = new double[N];
		double[] unitPrice = new double[N];
		for (int i = 0; i < amout.length; i++) {
			in.nextToken();
			amout[i] = in.nval;
		}
		for (int i = 0; i < unitPrice.length; i++) {
			in.nextToken();
			unitPrice[i] = in.nval / amout[i];
		}
		double[] unitPriceSort = Arrays.copyOf(unitPrice, unitPrice.length);
		Arrays.sort(unitPriceSort);
		double sum = 0;
		for (int i = 0; i < unitPrice.length; i++) {
			if (D == 0)
				break;
			for (int j = 0; j < unitPrice.length; j++) {
				if (unitPrice[j] == unitPriceSort[unitPriceSort.length - 1 - i]) {
					double current = amout[j];
					if (current > D) {
						sum += D * unitPrice[j];
						D -= D;
					} else {
						sum += current * unitPrice[j];
						D -= current;
					}
					break;
				}
			}
		}
		System.out.printf("%.2f", sum);
	}

}