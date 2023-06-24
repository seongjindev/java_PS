package dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//public class A9657 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        if (n % 7 == 0 || n % 7 == 2) {
//            System.out.println("CY");
//        } else {
//            System.out.println("SK");
//        }
//        br.close();
//    }
//}

//public class A9657 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        String[] dp = new String[n + 4];
//        dp[1] = "SK";
//        dp[2] = "CY";
//        dp[3] = "SK";
//        dp[4] = "SK";
//        for (int i = 5; i <= n; i++) {
//            if (dp[i - 1].equals("CY") || dp[i - 3].equals("CY") || dp[i- 4].equals("CY")) {
//                dp[i] = "SK";
//            } else {
//                dp[i] = "CY";
//            }
//        }
//        System.out.println(dp[n]);
//        br.close();
//    }
//}

public class A9657 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean[] dp = new boolean[n + 4];
        dp[1] = true;
        dp[3] = true;
        dp[4] = true;
        for (int i = 5; i <= n; i++) {
            if (!dp[i - 1] || !dp[i - 3] || !dp[i - 4]) {
                dp[i] = true;
            }
        }
        if (dp[n]) {
            System.out.println("SK");
        } else {
            System.out.println("CY");
        }
        br.close();
    }
}