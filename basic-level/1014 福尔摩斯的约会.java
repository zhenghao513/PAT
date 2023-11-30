import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        char[] s1 = in.readLine().toCharArray();
        char[] s2 = in.readLine().toCharArray();
        char[] s3 = in.readLine().toCharArray();
        char[] s4 = in.readLine().toCharArray();
        int len1 = Math.min(s1.length, s2.length);
        int len2 = Math.min(s3.length, s4.length);
        int day = 0, hour = 0, minute = 0;
        int i;
        for (i = 0; i < len1; i++) {
            // 测试点4要求周一到周日，所以是A-G
            if (s1[i] == s2[i] && s1[i] >= 'A' && s1[i] <= 'G') {
                day = s1[i] - 'A' + 1;
                break;
            }
        }
        for (i += 1; i < len1; i++) {
            if (s1[i] == s2[i]) {
                if (s1[i] >= 'A' && s1[i] <= 'N') {
                    hour = s1[i] - 'A' + 10;
                    break;
                } else if (Character.isDigit(s1[i])) {
                    hour = s1[i] - '0';
                    break;
                }
            }
        }
        for (int j = 0; j < len2; j++) {
            if (s3[j] == s4[j] && Character.isAlphabetic(s3[j])) {
                minute = j;
                break;
            }
        }
        String[] week = {"", "MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        StringBuilder sb = new StringBuilder();
        sb.append(week[day]).append(" ").append(String.format("%02d", hour)).append(":").append(String.format("%02d", minute));
        System.out.println(sb);
    }
}