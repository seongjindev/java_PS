package dynamicprogramming;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//public class A10211 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int tc = Integer.parseInt(br.readLine());
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < tc; i++) {
//            int n = Integer.parseInt(br.readLine());
//            int[] arr = new int[n];
//            int[] dp = new int[n];
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            for (int j = 0; j < n; j++) {
//                arr[j] = Integer.parseInt(st.nextToken());
//            }
//            for (int a = 0; a < n; a++) {
//                dp[a] = arr[a];
//                for (int b = 0; b < a; b++) {
//                    int max = 0;
//                    for (int c = b; c <= a; c++) {
//                        max += arr[c];
//                    }
//                    dp[a] = Math.max(dp[a], max);
//                }
//            }
//            int rst = dp[0];
//            for (int i1 : dp) {
//                rst = Math.max(rst, i1);
//            }
//            sb.append(rst).append("\n");
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A10211 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tc; i++) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n+1];
            int[] dp = new int[n+1];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            for (int a = 1; a <= n; a++) {
                dp[a] = Math.max(dp[a-1] + arr[a], arr[a]);
            }
            int rst = dp[1];
            for (int r = 1; r <= n; r++) {
                rst = Math.max(rst, dp[r]);
            }
            sb.append(rst).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}