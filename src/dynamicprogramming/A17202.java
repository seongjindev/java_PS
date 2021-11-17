package dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A17202 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();
        int[][] dp = new int[15][16];
        int cnt = 0;
        for (int i = 0; i < 15; i+=2) {
            dp[0][i] = Integer.parseInt(String.valueOf(a.charAt(cnt)));
            dp[0][i+1] = Integer.parseInt(String.valueOf(b.charAt(cnt)));
            cnt++;
        }
        for (int i = 1; i < 15; i++) {
            for (int j = 0; j < 16-i; j++) {
                dp[i][j] = (dp[i-1][j] + dp[i-1][j+1]) % 10;
            }
        }
        System.out.println(dp[14][0] + "" + dp[14][1]);
        br.close();
    }
}
