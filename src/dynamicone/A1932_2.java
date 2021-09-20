package dynamicone;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Scanner;
//import java.util.StringTokenizer;
//
////public class A1932_2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int cnt = sc.nextInt();
//        int[][] box = new int[cnt+1][cnt+1];
//        int[][] dp = new int[cnt+1][cnt+1];
//        for(int i=1; i<=cnt; i++) {
//            for(int j=1; j<=i; j++){
//                box[i][j] = sc.nextInt();
//            }
//        }
//        for(int i=1; i<=cnt; i++) {
//            for(int j=1; j<=i; j++) {
//                dp[i][j] = Math.max(dp[i-1][j-1], dp[i-1][j]) + box[i][j];
//            }
//        }
//        int max = 0;
//        for(int i=1; i<=cnt; i++) {
//            if(dp[cnt][i] >= max) {
//                max = dp[cnt][i];
//            }
//        }
//        System.out.println(max);
//        sc.close();
//    }
//}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A1932_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int[][] box = new int[cnt+1][cnt+1];
        int[][] dp = new int[cnt+1][cnt+1];
        for(int i=1; i<=cnt; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=1; j<=i; j++){
                box[i][j] = Integer.parseInt(st.nextToken());
                if(i==cnt){
                    dp[i][j] = box[i][j];
                }
            }
        }
        for(int i=cnt-1; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                dp[i][j] = Math.max(dp[i+1][j], dp[i+1][j+1]) + box[i][j];
            }
        }
        System.out.println(dp[1][1]);
        br.close();
    }
}

