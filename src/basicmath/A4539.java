package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//public class A4539 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < n; i++) {
//            double x = Double.parseDouble(br.readLine());
//            double c = x / 10;
//            int t = 10;
//            while (c > 1) {
//                x = (Math.round(x / t)) * t;
//                t *= 10;
//                c /= 10;
//            }
//            sb.append((int) x).append("\n");
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

public class A4539 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String x = br.readLine();
            double d = Double.parseDouble(x);
            for (int j = 0; j < x.length(); j++) {
                double p = Math.pow(10, j);
                d = Math.round(d / p) * p;
            }
            sb.append((int) d).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}
