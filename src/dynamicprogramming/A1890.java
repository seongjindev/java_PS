package dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A1890 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] nn = new int[n][n];
        long[][] dp = new long[n][n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                nn[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        //0,0
        dp[0][0] = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i==n-1 && j==n-1) {
                    continue;
                }
                if (nn[i][j] + i < n) {
                    dp[i+nn[i][j]][j] += dp[i][j];
                }
                if (nn[i][j] + j < n) {
                    dp[i][j+nn[i][j]] += dp[i][j];
                }
            }
        }
        System.out.println(dp[n-1][n-1]);
        br.close();
    }
}
//4
//1 1 1 1
//1 1 1 1
//1 1 1 1
//1 1 1 1