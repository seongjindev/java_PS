package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//public class A2980 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int l = Integer.parseInt(st.nextToken());
//        int rst = 0;
//        int bf = 0;
//        for (int i = 0; i < n; i++) {
//            st = new StringTokenizer(br.readLine());
//            int d = Integer.parseInt(st.nextToken());
//            int r = Integer.parseInt(st.nextToken());
//            int g = Integer.parseInt(st.nextToken());
//            rst += d - bf;
//            int time = rst;
//            bf = d;
//            boolean chk = false;
//            if (d == 1) {
//                continue;
//            }
//            while (true) {
//                if (time < r && !chk) {
//                    rst += r - time;
//                    break;
//                } else if (time < g && chk) {
//                    break;
//                }
//                if (!chk) {
//                    time -= r;
//                    chk = true;
//                } else {
//                    time -= g;
//                    chk = false;
//                }
//            }
//        }
//        System.out.println(l - bf + rst);
//        br.close();
//    }
//}

public class A2980 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        int rst = 0;
        int bf = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int d = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            int g = Integer.parseInt(st.nextToken());
            rst += d - bf;
            bf = d;
            if (rst % (r + g) < r) {
                rst += r - (rst % (r + g));
            }
        }
        System.out.println(l - bf + rst);
        br.close();
    }
}