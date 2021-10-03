package dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A9465 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int tc = Integer.parseInt(br.readLine());
        for (int i = 0; i < tc; i++) {
            int n = Integer.parseInt(br.readLine());
            int[][] arr = new int[3][n+1];
            int[][] dp = new int[3][n+1];
            for (int j = 1; j <= 2; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int k = 1; k <= n; k++) {
                    arr[j][k] = Integer.parseInt(st.nextToken());
                }
            }
            dp[1][1] = arr[1][1];
            dp[2][1] = arr[2][1];
            for (int a = 2; a <= n; a++) {
                dp[1][a] = Math.max(dp[2][a-1], dp[2][a-2]) + arr[1][a];
                dp[2][a] = Math.max(dp[1][a-1], dp[1][a-2]) + arr[2][a];
            }
            sb.append(Math.max(dp[1][n], dp[2][n])).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}
