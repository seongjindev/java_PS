package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//public class A1476 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int e = Integer.parseInt(st.nextToken());
//        int s = Integer.parseInt(st.nextToken());
//        int m = Integer.parseInt(st.nextToken());
//        int rst = 1;
//        int e1 = 1;
//        int s1 = 1;
//        int m1 = 1;
//        while (true) {
//            if (e == e1 && s == s1 && m == m1) {
//                System.out.println(rst);
//                break;
//            }
//            e1++;
//            s1++;
//            m1++;
//            if (e1 == 16) {
//                e1 = 1;
//            }
//            if (s1 == 29) {
//                s1 = 1;
//            }
//            if (m1 == 20) {
//                m1 = 1;
//            }
//            rst++;
//        }
//        br.close();
//    }
//}

public class A1476 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int e = Integer.parseInt(st.nextToken()) - 1;
        int s = Integer.parseInt(st.nextToken()) - 1;
        int m = Integer.parseInt(st.nextToken()) - 1;
        int rst = 0;
        while (true) {
            if (rst % 15 == e && rst % 28 == s && rst % 19 == m) {
                System.out.println(rst + 1);
                break;
            }
            rst++;
        }
        br.close();
    }
}