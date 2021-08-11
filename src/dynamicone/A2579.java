package dynamicone;

import java.util.Scanner;

public class A2579 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int[] dp = new int[cnt+1];
        int[] cost = new int[cnt+1];
        for(int i=1; i<=cnt; i++){
            cost[i] = sc.nextInt();
        }
        dp[1] = cost[1];
        dp[2] = cost[1] + cost[2];
        dp[3] = Math.max(cost[1], cost[2]) + cost[3];
        for(int i=4; i<=cnt; i++){
            dp[i] = Math.max(dp[i-3] + cost[i-1], dp[i - 2]) + cost[i];
        }
        System.out.println(dp[cnt]);

        sc.close();
    }
}
