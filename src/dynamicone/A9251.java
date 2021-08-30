package dynamicone;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class A9251 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String a = br.readLine();
//        String b = br.readLine();
//        int[][] dp = new int[b.length()+1][a.length()+1];
//        for(int i = 1; i <= b.length(); i++) {
//            for(int j = 1; j <= a.length(); j++) {
//                if(b.charAt(i-1) != a.charAt(j-1)) {
//                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
//                }else {
//                    dp[i][j] = dp[i-1][j-1] + 1;
//                }
//            }
//        }
//        System.out.println(dp[b.length()][a.length()]);
//        br.close();
//    }
//}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A9251 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] a = br.readLine().toCharArray();
        char[] b = br.readLine().toCharArray();
        int[][] dp = new int[a.length+1][b.length+1];

        for(int i = 1; i <= a.length; i++) {
            for(int j = 1; j <= b.length; j++) {
                if(a[i-1] == b[j-1]) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                }else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        System.out.println(dp[a.length][b.length]);
        br.close();
    }
}
