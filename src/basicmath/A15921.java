package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//public class A15921 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        if (n == 0) {
//            System.out.println("divide by zero");
//        } else {
//            double sum = 0;
//            double ev = 0;
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            for (int i = 0; i < n; i++) {
//                double num = Double.parseDouble(st.nextToken());
//                sum += num;
//                ev += num / n;
//            }
//            System.out.printf("%.2f", (sum / n) / ev);
//        }
//        br.close();
//    }
//}

public class A15921 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String rst = "divide by zero";
        if (n > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            rst = "1.00";
        }
        System.out.println(rst);
        br.close();
    }
}