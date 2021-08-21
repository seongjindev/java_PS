package dynamicone;

import java.util.Scanner;

public class A1463_2 {
    static Integer[] dp;
    static int cnt = 0;
    static int one(int n) {
        if(dp[n] == null) {
            if(n%6==0) {
                dp[n] = Math.min(one(n-1), Math.min(one(n/3), one(n/2))) + 1;
            }else if(n%3==0) {
                dp[n] = Math.min(one(n/3), one(n-1)) + 1;
            }else if(n%2==0) {
                dp[n] = Math.min(one(n/2), one(n-1)) + 1;
            }else{
                dp[n] = one(n-1) + 1;
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dp = new Integer[n+1];
        dp[0] = 0;
        dp[1] = 0;
        System.out.println(one(n));
        sc.close();
    }
}
