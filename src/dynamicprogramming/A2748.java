package dynamicprogramming;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class A2748 {
//    static Long[] dp;
//    static Long fi(int n) {
//        if (dp[n] != null) {
//            return dp[n];
//        }
//        dp[n] = fi(n-1) + fi(n-2);
//        return dp[n];
//
//    }
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        dp = new Long[n+1];
//        dp[0] = 0L;
//        dp[1] = 1L;
//        fi(n);
//        System.out.println(dp[n]);
//        br.close();
//    }
//}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A2748 {
    static Long[] dp;
    static Long fi(int n) {
        if (dp[n] == null) {
            dp[n] = fi(n-1) + fi(n-2);
        }
        return dp[n];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dp = new Long[n+1];
        dp[0] = 0L;
        dp[1] = 1L;
        System.out.println(fi(n));
        br.close();
    }
}
