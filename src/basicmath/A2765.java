package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//public class A2765 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        int cnt = 1;
//        while (true) {
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            double dm = Double.parseDouble(st.nextToken());
//            double rt = Double.parseDouble(st.nextToken());
//            if (rt == 0) {
//                break;
//            }
//            double t = Double.parseDouble(st.nextToken());
//            double rst = dm * 3.1415927 * rt / 12 / 5280;
//            double mph = Math.round(rst * 3600 / t * 100) / 100.0;
//            sb.append("Trip #").append(cnt).append(": ").append(String.format("%.2f", Math.round(rst * 100) / 100.0)).append(" ").append(String.format("%.2f", mph)).append("\n");
//            cnt++;
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

public class A2765 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int cnt = 1;
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double dm = Double.parseDouble(st.nextToken());
            double rt = Double.parseDouble(st.nextToken());
            if (rt == 0) {
                break;
            }
            double t = Double.parseDouble(st.nextToken());
            double rst = dm * 3.1415927 * rt / 12 / 5280;
            double mph = rst * 3600 / t;
            sb.append("Trip #").append(cnt).append(": ").append(String.format("%.2f", rst)).append(" ").append(String.format("%.2f", mph)).append("\n");
            cnt++;
        }
        System.out.println(sb);
        br.close();
    }
}
