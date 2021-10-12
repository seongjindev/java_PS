package dynamicprogramming;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class A11057 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        long[][] dp = new long[n+1][10];
//        for (int i = 0; i < 10; i++) {
//            dp[0][i] = 1;
//        }
//        for (int i = 1; i <= n; i++) {
//            for (int j = 0; j < 10; j++) {
//                for (int k = j; k < 10; k++) {
//                    dp[i][j] += dp[i-1][k];
//                    dp[i][j] %= 10007;
//                }
//            }
//        }
//        System.out.println(dp[n][0] & 10007);
//        br.close();
//    }
//}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A11057 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[][] dp = new long[n+2][10];
        for (int i = 0; i <= n+1; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i <= n+1; i++) {
            for (int j = 1; j < 10; j++) {
                if (i==1) {
                    dp[i][j] = 1;
                }else {
                    dp[i][j] = (dp[i-1][j] + dp[i][j-1]) % 10007;
                }
            }
        }
        System.out.println(dp[n+1][9] % 10007);
        br.close();
    }
}
