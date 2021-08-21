package dynamicone;

import java.util.Scanner;

//public class A10844 {
//    // 1 - 1 2 3 4 5 6 7 8 9
//    // 2 - 12 23 34 45 56 67 78 89 98 87 76 65 54 43 32 21 10
//    static int cnt = 0;
//    static int[] ns;
//    static void easy(int n, int deep) {
//        if(deep==n) {
//            cnt++;
//            return;
//        }
//        for(int i = 0; i <= 9; i++) {
//            if(deep==0 && i==0) {
//                continue;
//            }else {
//                if(deep==0) {
//                    ns[deep] = i;
//                    easy(n, deep+1);
//                }else {
//                    if(i==ns[deep-1]-1){
//                        ns[deep] = i;
//                        easy(n, deep+1);
//                    }else if(i==ns[deep-1]+1){
//                        ns[deep] = i;
//                        easy(n, deep+1);
//                    }
//                }
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        ns = new int[n];
//        easy(n, 0);
//        System.out.println(cnt%1000000000);
//        sc.close();
//    }
//}

//public class A10844 {
//    // 1 - 1 2 3 4 5 6 7 8 9
//    // 2 - 12 23 34 45 56 67 78 89 98 87 76 65 54 43 32 21 10
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        long dp[][] = new long[n+1][10];
//        int mod = 1000000000;
//        for(int i=1; i<10; i++) {
//            dp[1][i] = 1;
//        }
//        for(int i=2; i<=n; i++) {
//            for(int j=0; j<10; j++) {
//                if(j==0) {
//                    dp[i][j] = dp[i-1][1] % mod;
//                }else if(j==9) {
//                    dp[i][j] = dp[i-1][8] % mod;
//                }else {
//                    dp[i][j] = dp[i-1][j-1] + dp[i-1][j+1] % mod;
//                }
//            }
//        }
//        long cnt= 0;
//        for(int i=0; i<10; i++) {
//            cnt += dp[n][i];
//        }
//        System.out.println(cnt%mod);
//        sc.close();
//    }
//}

public class A10844 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long[][] d = new long[n+1][10];

        for(int i=1; i<=n; i++) {
            for(int j=0; j<=9; j++) {

                if(i>1 && j!=9) {
                    d[i][j] += d[i-1][j+1];
                }

                if(j!=0) {
                    d[i][j] += d[i-1][j-1];
                    if(i==1) {
                        d[i][j] = 1;
                    }
                }

                d[i][j] %= 1000000000L;
            }
        }

        long ans = 0;
        for(int i=0; i<=9; i++) {
            ans += d[n][i];
            ans %= 1000000000L;
        }

        System.out.println(ans);

    }

}
