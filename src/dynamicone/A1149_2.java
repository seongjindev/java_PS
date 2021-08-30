package dynamicone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A1149_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int[][] home = new int[cnt+1][4];
        int[][] dp = new int[cnt+1][4];
        for(int i=1; i<=cnt; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=1; j<=3; j++){
                home[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i=1; i<=cnt; i++){
            dp[i][1] = Math.min(dp[i-1][2], dp[i-1][3]) + home[i][1];
            dp[i][2] = Math.min(dp[i-1][1], dp[i-1][3]) + home[i][2];
            dp[i][3] = Math.min(dp[i-1][1], dp[i-1][2]) + home[i][3];
        }
        System.out.println(Math.min(dp[cnt][1],Math.min(dp[cnt][2], dp[cnt][3])));
    }
}
