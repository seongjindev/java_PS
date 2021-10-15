package dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A1495 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] muz = new int[n+1];
        int[][] dp = new int[n+1][m+1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            muz[i] = Integer.parseInt(st.nextToken());
        }
        dp[0][s] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < m+1; j++) {
                if (dp[i-1][j]==i) {
                    if (j+muz[i] <= m) {
                        dp[i][j+muz[i]] = i+1;
                    }
                    if (j-muz[i] >= 0) {
                        dp[i][j-muz[i]] = i+1;
                    }
                }
            }
        }
        int rst = -1;
        for (int i = m; i >= 0; i--) {
            if (dp[n][i] == n+1) {
                rst = i;
                break;
            }
        }
        System.out.println(rst);
        br.close();
    }
}
