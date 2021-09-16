package greedy;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//public class A11501 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        int tc = Integer.parseInt(br.readLine());
//        for (int i = 0; i < tc; i++) {
//            int n = Integer.parseInt(br.readLine());
//            long sum = 0;
//            int[] day = new int[n];
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            for (int j = 0; j < n; j++) {
//                day[j] = Integer.parseInt(st.nextToken());
//            }
//            for (int k = 0; k < n-1; k++) {
//                int max = 0;
//                for (int m = k+1; m < n; m++) {
//                    if (day[k] < day[m]) {
//                        max = Math.max(max, day[m]);
//                    }
//                }
//                if (max != 0) {
//                    sum += max - day[k];
//                }
//            }
//            sb.append(sum + "\n");
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A11501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int tc = Integer.parseInt(br.readLine());
        for (int i = 0; i < tc; i++) {
            int n = Integer.parseInt(br.readLine());
            long sum = 0;
            int[] day = new int[n];
            int max = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                day[j] = Integer.parseInt(st.nextToken());
            }
            for (int k = n-1; k >= 0; k--) {
                if (day[k] > max) {
                    max = day[k];
                } else {
                    sum += max - day[k];
                }
            }
            sb.append(sum + "\n");
        }
        System.out.println(sb);
        br.close();
    }
}