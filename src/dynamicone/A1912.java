package dynamicone;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//public class A1912 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int cnt = Integer.parseInt(br.readLine());
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int[] box = new int[cnt+1];
//        int[] dp = new int[cnt+1];
//        for (int i = 1; i <= cnt; i++) {
//            box[i] = Integer.parseInt(st.nextToken());
//        }
//        for (int i = 1; i <= cnt; i++) {
//            dp[i] = Math.max(box[i], dp[i-1] + box[i]);
//        }
//        int max = -1001;
//        for (int i = 1; i <= cnt; i++) {
//            max = Math.max(max, dp[i]);
//        }
//        System.out.println(max);
//        br.close();
//    }
//}

import java.io.*;
import java.util.StringTokenizer;

public class A1912 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] box = new int[cnt+1];
        int[] dp = new int[cnt+1];
        for (int i = 1; i <= cnt; i++) {
            box[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 1; i <= cnt; i++) {
            dp[i] = Math.max(box[i], dp[i-1] + box[i]);
        }
        int max = -1001;
        for (int i = 1; i <= cnt; i++) {
            max = Math.max(max, dp[i]);
        }
        bw.write(max + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
