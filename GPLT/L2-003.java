import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] input = in.readLine().split(" ");
        int n = parseInt(input[0]);
        int d = parseInt(input[1]);
        String[] stock = in.readLine().split(" ");
        String[] totalPrice = in.readLine().split(" ");
        double[] stocks = new double[n];
        double[] prices = new double[n];
        for (int i = 0; i < n; i++) {
            stocks[i] = parseDouble(stock[i]);
            prices[i] = parseDouble(totalPrice[i]) / stocks[i];
        }
        List<Moon> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list.add(new Moon(stocks[i], prices[i]));
        }
        list.sort(null);
        double ans = 0;
        for (Moon moon : list) {
            if (moon.stock >= d) {
                ans += moon.price * d;
                break;
            } else {
                ans += moon.stock * moon.price;
                d -= moon.stock;
            }
        }
        System.out.printf("%.2f", ans);
    }

}


class Moon implements Comparable<Moon> {
    public double stock;
    public double price;

    public Moon(double stock, double price) {
        this.stock = stock;
        this.price = price;
    }

    @Override
    public int compareTo(Moon o) {
        return Double.compare(o.price, this.price);
    }
}