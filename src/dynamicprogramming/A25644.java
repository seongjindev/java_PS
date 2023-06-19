package dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//public class A25644 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int[] a = new int[n];
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        for (int i = 0; i < n; i++) {
//            a[i] = Integer.parseInt(st.nextToken());
//        }
//        int min = 1000000001;
//        int rst = 0;
//        for (int i = 0; i < n - 1; i++) {
//            if (a[i] < min) {
//                min = a[i];
//            }
//            rst = Math.max(a[i + 1] - min, rst);
//        }
//        System.out.println(rst);
//        br.close();
//    }
//}

//public class A25644 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int rst = 0;
//        int min = Integer.parseInt(st.nextToken());
//        for (int i = 0; i < n - 1; i++) {
//            int num = Integer.parseInt(st.nextToken());
//            if (num < min) {
//                min = num;
//            }
//            rst = Math.max(num - min, rst);
//        }
//        System.out.println(rst);
//        br.close();
//    }
//}

//public class A25644 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int rst = 0;
//        int min = Integer.parseInt(st.nextToken());
//        for (int i = 0; i < n - 1; i++) {
//            int num = Integer.parseInt(st.nextToken());
//            min = Math.min(num, min);
//            rst = Math.max(num - min, rst);
//        }
//        System.out.println(rst);
//        br.close();
//    }
//}

public class A25644 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n + 1];
        int[] dp = new int[n + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i < n + 1; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        int min = a[1];
        for (int i = 1; i < n; i++) {
            min = Math.min(min, a[i]);
            dp[i] = Math.max(dp[i - 1], a[i + 1] - min);
        }
        System.out.println(dp[n - 1]);
        br.close();
    }
}
