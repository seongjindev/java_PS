package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//public class A15734 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int l = Integer.parseInt(st.nextToken());
//        int r = Integer.parseInt(st.nextToken());
//        int a = Integer.parseInt(st.nextToken());
//        while (l != r && a != 0) {
//            if (l < r && a > 0) {
//                a--;
//                l++;
//            } else if (l > r && a > 0) {
//                a--;
//                r++;
//            }
//        }
//        int rst = Math.min(l, r);
//        if (a / 2 > 0) {
//            rst += a / 2;
//        }
//        System.out.println(rst * 2);
//    }
//}

//public class A15734 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int l = Integer.parseInt(st.nextToken());
//        int r = Integer.parseInt(st.nextToken());
//        int a = Integer.parseInt(st.nextToken());
//        while (l != r && a != 0) {
//            if (l < r && a > 0) {
//                a--;
//                l++;
//            } else if (l > r && a > 0) {
//                a--;
//                r++;
//            }
//        }
//        int rst = Math.min(l, r) + (a / 2);
//        System.out.println(rst * 2);
//    }
//}

//public class A15734 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int l = Integer.parseInt(st.nextToken());
//        int r = Integer.parseInt(st.nextToken());
//        int a = Integer.parseInt(st.nextToken());
//        int abs = Math.abs(l - r);
//        int rst = Math.min(l, r);
//        if (abs == 0) {
//            rst += a / 2;
//        } else if (abs > a) {
//            rst = Math.min(l, r) + a;
//        } else {
//            rst = Math.max(l, r) + ((a - abs) / 2);
//        }
//        System.out.println(rst * 2);
//    }
//}

public class A15734 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int l = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int diff = Math.min(Math.abs(l - r), a);
        a -= diff;
        System.out.println(((a / 2) + Math.min(l, r) + diff) * 2);
    }
}