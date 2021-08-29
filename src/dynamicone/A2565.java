package dynamicone;

//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Arrays;
//import java.util.Comparator;
//import java.util.StringTokenizer;
//
//public class A2565 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int cnt = Integer.parseInt(br.readLine());
//        int[][] el = new int[cnt][2];
//        int[] dp = new int[cnt];
//        for(int i = 0; i < cnt; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            int a = Integer.parseInt(st.nextToken());
//            int b = Integer.parseInt(st.nextToken());
//            el[i][0] = a;
//            el[i][1] = b;
//        }
//
//        Arrays.sort(el, (Comparator.comparingInt(o -> o[0])));
//
//        for(int i = 0; i < cnt; i++) {
//            dp[i] = 1;
//
//            for(int j = 0; j < i; j++) {
//                if(el[i][1] > el[j][1]) {
//                    dp[i] = Math.max(dp[i], dp[j] +1);
//                }
//            }
//        }
//
//        int max = 0;
//        for(int i = 0; i < cnt; i++) {
//            max = Math.max(max, dp[i]);
//        }
//        System.out.println(cnt-max);
//    }
//}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class A2565 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int[][] el = new int[cnt][2];
        int[] dp = new int[cnt];
        for(int i = 0; i < cnt; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            el[i][0] = a;
            el[i][1] = b;
        }

        Arrays.sort(el, (Comparator.comparingInt(o -> o[0])));

        for(int i = 0; i < cnt; i++) {
            dp[i] = 1;

            for(int j = 0; j < i; j++) {
                if(el[i][1] > el[j][1]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }

        }

        int max = 0;
        for(int i = 0; i < cnt; i++) {
            max = Math.max(max, dp[i]);
        }
        System.out.println(cnt-max);
    }
}

