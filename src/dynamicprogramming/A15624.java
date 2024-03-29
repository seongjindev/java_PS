package dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//public class A15624 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int[] dp = new int[n + 2];
//        dp[0] = 0;
//        dp[1] = 1;
//        fib(n, dp);
//        System.out.println(dp[n]);
//        br.close();
//    }
//    static void fib(int n, int[] dp) {
//        for (int i = 2; i <= n; i++) {
//            dp[i] = (dp[i - 1] + dp[i - 2]) % 1000000007;
//        }
//    }
//}

public class A15624 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n + 2];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1000000007;
        }
        System.out.println(dp[n]);
        br.close();
    }
}