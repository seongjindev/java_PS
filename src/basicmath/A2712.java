package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//public class A2712 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        int tc = Integer.parseInt(br.readLine());
//        for (int i = 0; i < tc; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            double rst;
//            String u;
//            double num = Double.parseDouble(st.nextToken());
//            String ut = st.nextToken();
//            if (ut.equals("kg")) {
//                rst = Math.round(num * 2.2046 * 10000) / 10000.0;
//                u = " lb";
//            } else if (ut.equals("lb")) {
//                rst = Math.round(num * 0.4536 * 10000) / 10000.0;
//                u = " kg";
//            } else if (ut.equals("l")) {
//                rst = Math.round(num * 0.2642 * 10000) / 10000.0;
//                u = " g";
//            } else {
//                rst = Math.round(num * 3.7854 * 10000) / 10000.0;
//                u = " l";
//            }
//            sb.append(String.format("%.4f", rst)).append(u).append("\n");
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

public class A2712 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int tc = Integer.parseInt(br.readLine());
        for (int i = 0; i < tc; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double num = Double.parseDouble(st.nextToken());
            String ut = st.nextToken();
            double rst;
            String u;
            if (ut.equals("kg")) {
                rst = num * 2.2046;
                u = " lb";
            } else if (ut.equals("lb")) {
                rst = num * 0.4536;
                u = " kg";
            } else if (ut.equals("l")) {
                rst = num * 0.2642;
                u = " g";
            } else {
                rst = num * 3.7854;
                u = " l";
            }
            sb.append(String.format("%.4f", rst)).append(u).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}