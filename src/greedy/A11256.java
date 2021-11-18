package greedy;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.StringTokenizer;
//
//public class A11256 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int tc = Integer.parseInt(br.readLine());
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < tc; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            int j = Integer.parseInt(st.nextToken());
//            int n = Integer.parseInt(st.nextToken());
//            Integer[] arr = new Integer[n];
//            for (int k = 0; k < n; k++) {
//                st = new StringTokenizer(br.readLine());
//                arr[k] = Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
//            }
//            Arrays.sort(arr, Collections.reverseOrder());
//            int cnt = 0;
//            int sum = 0;
//            for (int l = 0; l < n; l++) {
//                if (sum >= j) {
//                    break;
//                }
//                sum += arr[l];
//                cnt++;
//            }
//            sb.append(cnt).append("\n");
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class A11256 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tc; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int j = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            Queue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
            for (int k = 0; k < n; k++) {
                st = new StringTokenizer(br.readLine());
                q.offer(Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken()));
            }
            int cnt = 0;
            for (int l = 0; l < n; l++) {
                if (j <= 0) {
                    break;
                }
                j -= q.poll();
                cnt++;
            }
            sb.append(cnt).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}