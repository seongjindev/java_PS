package dynamicone;

import java.util.Scanner;

//public class A1932 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int cnt = sc.nextInt();
//        int[][] dp = new int[cnt+1][cnt+1];
//        int[][] cost = new int[cnt+1][cnt+1];
//        for(int i=1; i<cnt+1; i++){
//            for(int j=1; j<i+1; j++){
//                cost[i][j] = sc.nextInt();
//            }
//        }
//        dp[1][1] = cost[1][1];
//        for(int i=2; i<cnt+1; i++){
//            for(int j=1; j<i+1; j++){
//                if(j==1){
//                    dp[i][j] = cost[i][j] + dp[i-1][j];
//                }else{
//                    dp[i][j] = cost[i][j] + Math.max(dp[i-1][j], dp[i-1][j-1]);
//                }
//            }
//        }
//        int max = 0;
//        for(int i=1; i<cnt+1; i++){
//            if(dp[cnt][i]>max){
//                max = dp[cnt][i];
//            }
//        }
//        System.out.println(max);
//        sc.close();
//    }
//}

public class A1932 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int[][] dp = new int[cnt+1][cnt+1];
        int[][] cost = new int[cnt+1][cnt+1];
        for(int i=1; i<=cnt; i++){
            for(int j=1; j<=i; j++){
                cost[i][j] = sc.nextInt();
                if(i==cnt){
                    dp[i][j] = cost[i][j];
                }
            }
        }
        for(int i=cnt; i>=1; i--){
            for(int j=1; j<cnt; j++){
                dp[i-1][j] = cost[i-1][j] + Math.max(dp[i][j], dp[i][j+1]);
            }
        }
        System.out.println(dp[1][1]);
        sc.close();
    }
}
