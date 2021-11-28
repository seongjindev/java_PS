package greedy;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//public class A1817 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int m = Integer.parseInt(st.nextToken());
//        int cnt = 0;
//        if (n != 0) {
//            int[] books = new int[n];
//            st = new StringTokenizer(br.readLine());
//            for (int i = 0; i < n; i++) {
//                books[i] = Integer.parseInt(st.nextToken());
//            }
//            int m2 = m;
//            cnt = 1;
//            for (int i = 0; i < n; i++) {
//                if (m2 - books[i] < 0) {
//                    cnt++;
//                    m2 = m - books[i];
//                } else {
//                    m2 = m2 - books[i];
//                }
//            }
//        }
//        System.out.println(cnt);
//        br.close();
//    }
//}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A1817 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        if (n == 0) {
            System.out.println(0);
            return;
        }
        int cnt = 0;
        int[] books = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            books[i] = Integer.parseInt(st.nextToken());
        }
        int m2 = m;
        cnt = 1;
        for (int i = 0; i < n; i++) {
            if (m2 - books[i] < 0) {
                cnt++;
                m2 = m - books[i];
            } else {
                m2 = m2 - books[i];
            }
        }
        System.out.println(cnt);
        br.close();
    }
}

