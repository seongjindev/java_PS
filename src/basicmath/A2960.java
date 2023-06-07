package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//public class A2960 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken()) + 1;
//        int k = Integer.parseInt(st.nextToken());
//        boolean[] chk = new boolean[n];
//        int cnt = 0;
//        int rst = 0;
//        loop:
//        for (int i = 2; i < n; i++) {
//            for (int j = 1; j < n; j++) {
//                if (i * j < n && !chk[i * j]) {
//                    chk[i * j] = true;
//                    cnt++;
//                    if (cnt == k) {
//                        rst = i * j;
//                        break loop;
//                    }
//                }
//            }
//        }
//        System.out.println(rst);
//        br.close();
//    }
//}

//public class A2960 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken()) + 1;
//        int k = Integer.parseInt(st.nextToken());
//        boolean[] chk = new boolean[n];
//        int cnt = 0;
//        int rst = 0;
//        for (int i = 2; i < n; i++) {
//            for (int j = 1; j < n; j++) {
//                if (i * j < n && !chk[i * j]) {
//                    chk[i * j] = true;
//                    cnt++;
//                    if (cnt == k) {
//                        rst = i * j;
//                        break;
//                    }
//                }
//            }
//            if (rst != 0) {
//                break;
//            }
//        }
//        System.out.println(rst);
//        br.close();
//    }
//}

public class A2960 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()) + 1;
        int k = Integer.parseInt(st.nextToken());
        boolean[] chk = new boolean[n];
        int cnt = 0;
        int rst = 0;
        for (int i = 2; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (i * j >= n) {
                    break;
                }
                if (!chk[i * j]) {
                    chk[i * j] = true;
                    cnt++;
                    if (cnt == k) {
                        rst = i * j;
                        break;
                    }
                }
            }
            if (rst != 0) {
                break;
            }
        }
        System.out.println(rst);
        br.close();
    }
}
