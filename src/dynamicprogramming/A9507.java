package dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A9507 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Long[] dp = new Long[68];
        dp[0] = 1L;
        dp[1] = 1L;
        dp[2] = 2L;
        dp[3] = 4L;
        for (int i = 0; i < tc; i++) {
            int n = Integer.parseInt(br.readLine());
            if (dp[n] == null) {
                for (int j = 4; j <= n; j++) {
                    dp[j] = dp[j-1] + dp[j-2] + dp[j-3] + dp[j-4];
                }
            }
            sb.append(dp[n]).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}
