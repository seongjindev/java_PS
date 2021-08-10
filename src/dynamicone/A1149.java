package dynamicone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A1149 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int[][] home = new int[cnt+1][3];
        int[][] dp = new int[cnt+1][3];
        for(int i=1; i<cnt+1; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            home[i][0] = Integer.parseInt(st.nextToken());
            home[i][1] = Integer.parseInt(st.nextToken());
            home[i][2] = Integer.parseInt(st.nextToken());
        }
        for(int i=1; i<cnt+1; i++){
            dp[i][0] = Math.min(dp[i-1][1], dp[i-1][2])+home[i][0];
            dp[i][1] = Math.min(dp[i-1][0], dp[i-1][2])+home[i][1];
            dp[i][2] = Math.min(dp[i-1][0], dp[i-1][1])+home[i][2];
        }
        System.out.println(Math.min(Math.min(dp[cnt][0],dp[cnt][1]),dp[cnt][2]));
    }
}
