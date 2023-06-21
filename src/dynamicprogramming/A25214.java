package dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//public class A25214 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int[] arr = new int[n + 1];
//        int[] dp = new int[n + 1];
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        for (int i = 1; i < n + 1; i++) {
//            arr[i] = Integer.parseInt(st.nextToken());
//        }
//        int min = arr[1];
//        for (int i = 1; i < n + 1; i++) {
//            min = Math.min(min, arr[i]);
//            dp[i] = Math.max(dp[i - 1], arr[i] - min);
//        }
//        for (int i = 1; i < n + 1; i++) {
//            System.out.print(dp[i] + " ");
//        }
//        br.close();
//    }
//}

//public class A25214 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int min = Integer.parseInt(st.nextToken());
//        int max = 0;
//        StringBuilder sb = new StringBuilder();
//        sb.append(0).append(" ");
//        for (int i = 1; i < n; i++) {
//            int a = Integer.parseInt(st.nextToken());
//            min = Math.min(min, a);
//            max = Math.max(max, a - min);
//            sb.append(max).append(" ");
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

public class A25214 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int min = 1000000001;
        int max = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(st.nextToken());
            min = Math.min(min, a);
            max = Math.max(max, a - min);
            sb.append(max).append(" ");
        }
        System.out.println(sb);
        br.close();
    }
}
