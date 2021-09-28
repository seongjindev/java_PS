package dynamicprogramming;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//public class A14501 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int[][] dv = new int[n+1][2];
//        int[][] dp = new int[n+1][2];
//        for (int i = 1; i <= n; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            int a = Integer.parseInt(st.nextToken());
//            int b = Integer.parseInt(st.nextToken());
//            dv[i][0] = a;
//            dv[i][1] = b;
//        }
//        for (int i = 1; i <= n; i++) {
//            dp[i][0] = dv[i][0] + i - 1;
//            if (dv[i][0] + i - 1 > n) {
//                dv[i][1] = 0;
//            }else {
//                dp[i][1] = dv[i][1];
//            }
//            for (int j = 1; j < i; j++) {
//                if (dp[j][0] < i && dp[i][1] < dp[j][1] + dv[i][1]) {
//                    dp[i][1] = dp[j][1] + dv[i][1];
//                }
//            }
//        }
//        int max = 0;
//        for (int[] ints : dp) {
//            max = Math.max(max, ints[1]);
//        }
//        System.out.println(max);
//        br.close();
//    }
//}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A14501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] d = new int[n+1];
        int[] v = new int[n+1];
        int[] dp = new int[n+2];
        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            d[i] = a;
            v[i] = b;
        }
        for (int i = n; i > 0; i--) {
            if (d[i] > n-i+1) {
                dp[i] = dp[i+1];
            }else {
                dp[i] = Math.max(dp[i+1], dp[i+d[i]]+v[i]);
            }
        }

        br.close();
    }
}
