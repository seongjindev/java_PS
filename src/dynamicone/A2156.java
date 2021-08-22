package dynamicone;

//import java.util.Scanner;

//public class A2156 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int cnt = sc.nextInt();
//        int[] qt = new int[cnt+4];
//        long[] dp = new long[cnt+4];
//        for(int i = 1; i <= cnt; i++) {
//            qt[i] = sc.nextInt();
//        }
//        dp[1] = qt[1];
//        dp[2] = dp[1] + qt[2];
//        dp[3] = Math.max(Math.max(dp[2], dp[0]+qt[1] +qt[3]), dp[0]+qt[2]+qt[3]) ;
//        dp[4] = Math.max(Math.max(Math.max(dp[0] + qt[2] + qt[3], dp[0] + qt[2] + qt[4]), dp[1] + qt[3] +qt[4]), dp[2] + qt[4]);
//        if(cnt>4) {
//            for(int i = 5; i <= cnt; i++) {
//                dp[i] = Math.max(Math.max(Math.max(dp[i-4] + qt[i-2] + qt[i-1], dp[i-4] + qt[i-2] + qt[i]), dp[i-3] + qt[i-1] +qt[i]), dp[i-5]+ qt[i-3] + qt[i-2] + qt[i]);
//            }
//        }
//        System.out.println(dp[cnt]);
//        sc.close();
//    }
//}
//import java.util.Scanner;
//
//public class A2156 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int cnt = sc.nextInt();
//        int[] qt = new int[cnt+4];
//        long[] dp = new long[cnt+4];
//        for(int i = 1; i <= cnt; i++) {
//            qt[i] = sc.nextInt();
//        }
//        dp[1] = qt[1];
//        dp[2] = dp[1] + qt[2];
//        dp[3] = Math.max(Math.max(dp[2], dp[0]+qt[1] +qt[3]), dp[0]+qt[2]+qt[3]) ;
//        if(cnt>3) {
//            for(int i = 4; i <= cnt; i++) {
//                dp[i] = Math.max(Math.max(dp[i-2] + qt[i], dp[i-1]), dp[i-3]+qt[i-1] +qt[i]);
//            }
//        }
//        System.out.println(dp[cnt]);
//        sc.close();
//    }
//}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A2156 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int[] qt = new int[cnt+4];
        long[] dp = new long[cnt+4];
        for(int i = 1; i <= cnt; i++) {
            qt[i] = Integer.parseInt(br.readLine());
        }
        dp[1] = qt[1];
        dp[2] = dp[1] + qt[2];
        dp[3] = Math.max(Math.max(dp[2], dp[0]+qt[1] +qt[3]), dp[0]+qt[2]+qt[3]) ;
        if(cnt>3) {
            for(int i = 4; i <= cnt; i++) {
                dp[i] = Math.max(Math.max(dp[i-2] + qt[i], dp[i-1]), dp[i-3]+qt[i-1] +qt[i]);
            }
        }
        System.out.println(dp[cnt]);
        br.close();
    }
}