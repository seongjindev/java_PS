package dynamicone;

import java.util.Scanner;

public class A2579_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int[] box = new int[cnt+3];
        int[] dp = new int[cnt+3];

        for(int i = 1; i <= cnt; i++) {
            box[i] = sc.nextInt();
        }
        dp[1] = box[1];
        dp[2] = box[1] + box[2];
        dp[3] = Math.max(box[1], box[2]) + box[3];

        for(int i=4; i<= cnt; i++) {
            dp[i] = Math.max(dp[i-3] + box[i-1], dp[i-2]) + box[i];
        }
        System.out.println(dp[cnt]);
        sc.close();
    }
}
