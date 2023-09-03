package dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//public class A14430 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int m = Integer.parseInt(st.nextToken());
//        int[][] in = new int[n + 1][m + 1];
//        int[][] dp = new int[n + 1][m + 1];
//        for (int i = 1; i < n + 1; i++) {
//            st = new StringTokenizer(br.readLine());
//            for (int j = 1; j < m + 1; j++) {
//                in[i][j] = Integer.parseInt(st.nextToken());
//            }
//        }
//        for (int i = 1; i < n + 1; i++) {
//            for (int j = 1; j < m + 1; j++) {
//                dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]) + in[i][j];
//            }
//        }
//        int max = 0;
//        for (int i = 1; i < n + 1; i++) {
//            for (int j = 1; j < m + 1; j++) {
//                max = Math.max(max, dp[i][j]);
//            }
//        }
//        System.out.println(max);
//        br.close();
//    }
//}

//public class A14430 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int m = Integer.parseInt(st.nextToken());
//        int[][] in = new int[n + 1][m + 1];
//        int[][] dp = new int[n + 1][m + 1];
//        int max = 0;
//        for (int i = 1; i < n + 1; i++) {
//            st = new StringTokenizer(br.readLine());
//            for (int j = 1; j < m + 1; j++) {
//                in[i][j] = Integer.parseInt(st.nextToken());
//                dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]) + in[i][j];
//                max = Math.max(max, dp[i][j]);
//            }
//        }
//        System.out.println(max);
//        br.close();
//    }
//}

public class A14430 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] dp = new int[n + 1][m + 1];
        int max = 0;
        for (int i = 1; i < n + 1; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j < m + 1; j++) {
                dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]) + Integer.parseInt(st.nextToken());
                max = Math.max(max, dp[i][j]);
            }
        }
        System.out.println(max);
        br.close();
    }
}