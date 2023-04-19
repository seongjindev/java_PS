package basicmath;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//public class A1551 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int k = Integer.parseInt(st.nextToken());
//        String[] split = br.readLine().split(",");
//        for (int i = 0; i < k; i++) {
//            for (int j = 0; j < n-1-i; j++) {
//                split[j] = String.valueOf(Integer.parseInt(split[j+1]) - Integer.parseInt(split[j]));
//            }
//        }
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < n-k; i++) {
//            if (i == n-k-1) {
//                sb.append(split[i]);
//            } else {
//                sb.append(split[i]).append(",");
//            }
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A1551 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        StringTokenizer st2 = new StringTokenizer(br.readLine(), ",");
        int[] box = new int[n];
        for (int i = 0; i < n; i++) {
            box[i] = Integer.parseInt(st2.nextToken());
        }
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n-1-i; j++) {
                box[j] = box[j+1] - box[j];
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n-k; i++) {
            sb.append(box[i]);
            if (i != n-k-1) {
                sb.append(",");
            }
        }
        System.out.println(sb);
        br.close();
    }
}
