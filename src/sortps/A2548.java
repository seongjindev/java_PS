package sortps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//public class A2548 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = Integer.parseInt(st.nextToken());
//        }
//        int min = 200000001;
//        int rst = 200000001;
//        Arrays.sort(arr);
//        for (int i = 0; i < n; i++) {
//            int sum = 0;
//            for (int j = 0; j < n; j++) {
//                sum += Math.abs(arr[i] - arr[j]);
//            }
//            if (sum < min) {
//                min = sum;
//                rst = arr[i];
//            }
//        }
//        System.out.println(rst);
//        br.close();
//    }
//}

//public class A2548 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = Integer.parseInt(st.nextToken());
//        }
//        int min = 200000001;
//        int rst = 200000001;
//        for (int i = 0; i < n; i++) {
//            int sum = 0;
//            for (int j = 0; j < n; j++) {
//                sum += Math.abs(arr[i] - arr[j]);
//            }
//            if (sum < min) {
//                min = sum;
//                rst = arr[i];
//            } else if (sum == min) {
//                rst = Math.min(rst, arr[i]);
//            }
//        }
//        System.out.println(rst);
//        br.close();
//    }
//}

public class A2548 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int idx;
        if (n % 2 == 0) {
            idx = n / 2 - 1;
        } else {
            idx = n / 2;
        }
        Arrays.sort(arr);
        System.out.println(arr[idx]);
        br.close();
    }
}