package sortps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.Collections;

//public class A2693 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        StringTokenizer st;
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < n; i++) {
//            st = new StringTokenizer(br.readLine());
//            Integer[] arr = new Integer[10];
//            for (int j = 0; j < 10; j++) {
//                arr[j] = Integer.parseInt(st.nextToken());
//            }
//            Arrays.sort(arr, Collections.reverseOrder());
//            sb.append(arr[2]).append("\n");
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

public class A2693 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int[] arr = new int[10];
            for (int j = 0; j < 10; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            sb.append(arr[7]).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}