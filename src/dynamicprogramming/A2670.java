package dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A2670 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        double[] db = new double[n];
        double[] dp = new double[n];
        for (int i = 0; i < n; i++) {
            db[i] = Double.parseDouble(br.readLine());
        }
        dp[0] = db[0];
        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(dp[i-1]*db[i], db[i]);
        }
        double max = 0;
        for (double v : dp) {
            max = Math.max(max, v);
        }
        System.out.printf("%.3f",max);
        br.close();
    }
}
