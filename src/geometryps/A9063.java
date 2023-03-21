package geometryps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

//public class A9063 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int wmax = -10001, wmin = 10001, lmax = -10001, lmin = 10001;
//        for (int i = 0; i < n; i++) {
//            int w = sc.nextInt();
//            int l = sc.nextInt();
//            if (wmax < w) {
//                wmax = w;
//            }
//            if (wmin > w) {
//                wmin = w;
//            }
//            if (lmax < l) {
//                lmax = l;
//            }
//            if (lmin > l) {
//                lmin = l;
//            }
//        }
//        System.out.println((wmax-wmin) * (lmax-lmin));
//        sc.close();
//    }
//}

public class A9063 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int wmax = -10001, wmin = 10001, lmax = -10001, lmin = 10001;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int w = Integer.parseInt(st.nextToken());
            int l = Integer.parseInt(st.nextToken());
            if (wmax < w) {
                wmax = w;
            }
            if (wmin > w) {
                wmin = w;
            }
            if (lmax < l) {
                lmax = l;
            }
            if (lmin > l) {
                lmin = l;
            }
        }
        System.out.println((wmax-wmin) * (lmax-lmin));
        br.close();
    }
}
