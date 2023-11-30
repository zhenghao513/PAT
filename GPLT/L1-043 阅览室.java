import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(in.readLine());
        for (int i = 0; i < N; i++) {
            // double除以0不会报错，返回NaN
            double sum = 0;
            int cnt = 0;
            String[] record = in.readLine().split(" ");
            Map<String, Integer> map = new HashMap<String, Integer>();
            // 将0作为书号输入时，表示一天工作结束
            while (!record[0].equals("0")) {
                // 记录开始时间
                if (record[1].equals("S")) {
                    String[] x = record[2].split(":");
                    int start = Integer.parseInt(x[0]) * 60 + Integer.parseInt(x[1]);
                    // 测试点1，只有借没有还，记录最新的借
                    map.put(record[0], start);
                }
                // 记录结束时间
                else if (record[1].equals("E")) {
                    String[] x = record[2].split(":");
                    int end = Integer.parseInt(x[0]) * 60 + Integer.parseInt(x[1]);
                    // 检查该书是否被借走
                    if (map.containsKey(record[0])) {
                        // 存在借阅记录，借书次数+1
                        cnt++;
                        // 记录借阅时间
                        sum += (end - map.get(record[0]));
                        map.remove(record[0]);
                    }

                }
                record = in.readLine().split(" ");
            }
            System.out.printf("%d %d\n", cnt, Math.round(sum / cnt));
        }

    }

}