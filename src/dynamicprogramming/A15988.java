package dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A15988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        long[] dp = new long[1000001];
        dp[1] = 1; //1
        dp[2] = 2; //1 1, 2
        dp[3] = 4; //1 1 1, 1 2, 2 1, 3
        //4 = 4 2 1
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            if (dp[num]==0) {
                for (int j = 4; j <= num; j++) {
                    dp[j] = (dp[j-1] + dp[j-2] + dp[j-3]) % 1000000009;
                }
            }
            sb.append(dp[num]).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}
