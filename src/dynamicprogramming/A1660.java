package dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A1660 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n+2];
        int[] dp2 = new int[n+2];
        int seq = 1;
        while (true) {
            dp[seq] = dp[seq-1] + seq;
            dp2[seq] = dp[seq] + dp2[seq-1];
            if (dp2[seq] > n) {
                break;
            }
            seq++;
        }
        int[] sum = new int[n+1];
        sum[1] = 1;
        for (int i = 2; i <= n; i++) {
            sum[i] = Integer.MAX_VALUE;
            for (int j = 1; j < i; j++) {
                if (dp2[j] > i) {
                    break;
                }
                sum[i] = Math.min(sum[i], sum[i - dp2[j]] + 1);
            }
        }
        System.out.println(sum[n]);
        br.close();
    }
}
