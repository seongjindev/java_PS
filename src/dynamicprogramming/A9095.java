package dynamicprogramming;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class A9095 {
//    static int sum;
//    static void dp(int n, int chk) {
//        if (chk == n) {
//            sum++;
//            return;
//        }
//        for (int i = 1; i <= 3; i++) {
//            if (chk+i <= n) {
//                chk += i;
//                dp(n, chk);
//                chk -= i;
//            }
//        }
//    }
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int tc = Integer.parseInt(br.readLine());
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < tc; i++) {
//            int n = Integer.parseInt(br.readLine());
//            sum = 0;
//            dp(n, 0);
//            sb.append(sum).append("\n");
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A9095 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int[] dp = new int[11];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for (int i = 0; i < tc; i++) {
            int n = Integer.parseInt(br.readLine());
            for (int j = 4; j <= n; j++) {
                dp[j] = dp[j-3] + dp[j-2] + dp[j-1];
            }
            sb.append(dp[n]).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}