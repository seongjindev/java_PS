package dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class A17212 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] coin = {1, 2, 5, 7};
        int[] dp = new int[n+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < 4; j++) {
                if (coin[j] < i && dp[i - coin[j]] + dp[coin[j]] < dp[i]) {
                    dp[i] = dp[i - coin[j]] + dp[coin[j]];
                } else if (i == coin[j]) {
                    dp[i] = 1;
                }
            }
        }
        System.out.println(dp[n]);
        br.close();
    }
}
