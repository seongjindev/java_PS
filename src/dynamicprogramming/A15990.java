package dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A15990 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        Integer[] an = new Integer[n+1];
        Long[][] dp = new Long[100001][4];
        for (int i = 1; i <= n; i++) {
            an[i] = Integer.parseInt(br.readLine());
        }
        dp[1][1] = 1L; //1
        dp[1][2] = 0L;
        dp[1][3] = 0L;
        dp[2][1] = 0L;
        dp[2][2] = 1L;
        dp[2][3] = 0L;
        dp[3][1] = 1L;
        dp[3][2] = 1L;
        dp[3][3] = 1L;
        //4 - 1 2 1, 1 3, 3 1
        //5 - 1 3 1, 2 3, 3 2
        //6 - 1 3 2, 1 2 3, 2 1 3, 2 3 1, 3 1 2, 3 2 1
        for (int i = 1; i <= n; i++) {
            if (dp[an[i]][1]==null && dp[an[i]][2]==null && dp[an[i]][3]==null) {
                for (int j = 4; j <= an[i]; j++) {
                    dp[j][1] = (dp[j-1][2] + dp[j-1][3]) % 1000000009;
                    dp[j][2] = (dp[j-2][1] + dp[j-2][3]) % 1000000009;
                    dp[j][3] = (dp[j-3][1] + dp[j-3][2]) % 1000000009;
                }
            }
            sb.append((dp[an[i]][1] + dp[an[i]][2] + dp[an[i]][3]) % 1000000009).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}
