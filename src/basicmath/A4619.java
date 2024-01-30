package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//public class A4619 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        while (true) {
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            int b = Integer.parseInt(st.nextToken());
//            int n = Integer.parseInt(st.nextToken());
//            if (b == 0 && n == 0) break;
//            int rst = 0;
//            int min = (int) Math.abs(Math.pow(0, n) - b);
//            int a = 1;
//            while (true) {
//                int pow = (int) Math.pow(a, n);
//                int abs = Math.abs(pow - b);
//                if (min < abs) {
//                    break;
//                }
//                min = abs;
//                rst = a;
//                if (pow >= b) {
//                    break;
//                }
//                a++;
//            }
//            sb.append(rst).append("\n");
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

public class A4619 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int b = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            if (b == 0 && n == 0) break;
            int sr = (int) Math.pow(b, 1.0 / n);
            int p1 = Math.abs((int) Math.pow(sr, n) - b);
            int p2 = Math.abs((int) Math.pow(sr + 1, n) - b);
            if (p1 < p2) {
                sb.append(sr).append("\n");
            } else {
                sb.append(sr + 1).append("\n");
            }
        }
        System.out.println(sb);
        br.close();
    }
}
