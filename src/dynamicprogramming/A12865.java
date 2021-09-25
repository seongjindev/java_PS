package dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A12865 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[][] wv = new int[n+1][2];
        int[][] dp = new int[n+1][k+1];
        for (int i = 1; i <= n; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            wv[i][0] = Integer.parseInt(st2.nextToken());
            wv[i][1] = Integer.parseInt(st2.nextToken());
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= k; j++) {
                if (wv[i][0] > j) {
                    dp[i][j] = dp[i-1][j];
                }else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-wv[i][0]]+wv[i][1]);
                }
            }
        }
        System.out.println(dp[n][k]);
        br.close();
    }
}
