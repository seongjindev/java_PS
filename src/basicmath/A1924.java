package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A1924 {
    public static void main(String[] args) throws IOException {
        int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30 ,31};
        String[] week = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int sum = 0;
        for (int i = 0; i < m-1; i++) {
            sum += month[i];
        }
        sum += d;
        System.out.println(week[sum % 7]);
        br.close();
    }
}
