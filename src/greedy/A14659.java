package greedy;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//public class A14659 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int cnt = Integer.parseInt(br.readLine());
//        int[] arr = new int[cnt];
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        for (int i = 0; i < cnt; i++) {
//            arr[i] = Integer.parseInt(st.nextToken());
//        }
//        int max = 0;
//        int nc = 0;
//        int n = arr[0];
//        for (int i = 1; i < cnt; i++) {
//            if (n >= arr[i]) {
//                nc++;
//                max = Math.max(max, nc);
//            }else {
//                max = Math.max(max, nc);
//                nc = 0;
//                n = arr[i];
//            }
//        }
//        System.out.println(max);
//        br.close();
//    }
//}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A14659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int max = 0;
        int nc = 0;
        int n = Integer.parseInt(st.nextToken());
        for (int i = 1; i < cnt; i++) {
            int m = Integer.parseInt(st.nextToken());
            if (n >= m) {
                nc++;
                max = Math.max(max, nc);
            }else {
                max = Math.max(max, nc);
                nc = 0;
                n = m;
            }
        }
        System.out.println(max);
        br.close();
    }
}
