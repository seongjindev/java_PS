package dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//public class A17202Re {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int a = Integer.parseInt(br.readLine());
//        int b = Integer.parseInt(br.readLine());
//        int[][] dp = new int[15][16];
//        for (int i = 15; i >= 0; i -= 2) {
//            dp[0][i - 1] = a % 10;
//            dp[0][i] = b % 10;
//            a /= 10;
//            b /= 10;
//        }
//        for (int i = 1; i < 15; i++) {
//            for (int j = 0; j < 16 - i; j++) {
//                dp[i][j] = (dp[i - 1][j] + dp[i - 1][j + 1]) % 10;
//            }
//        }
//        System.out.println(dp[14][0] + "" + dp[14][1]);
//        br.close();
//    }
//}

public class A17202Re {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int[][] dp = new int[15][16];
        for (int i = 15; i >= 0; i -= 2) {
            dp[0][i - 1] = a % 10;
            dp[0][i] = b % 10;
            a /= 10;
            b /= 10;
        }
        for (int i = 1; i < 15; i++) {
            for (int j = 0; j < 16 - i; j++) {
                dp[i][j] = (dp[i - 1][j] + dp[i - 1][j + 1]) % 10;
            }
        }
        sb.append(dp[14][0]).append(dp[14][1]);
        System.out.println(sb);
        br.close();
    }
}