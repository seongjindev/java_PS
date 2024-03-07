package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//public class A5361 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        double[] price = {350.34, 230.90, 190.55, 125.30, 180.90};
//        int tc = Integer.parseInt(br.readLine());
//        for (int i = 0; i < tc; i++) {
//            String[] sp = br.readLine().split(" ");
//            double sum = 0;
//            for (int j = 0; j < sp.length; j++) {
//                sum += price[j] * Double.parseDouble(sp[j]);
//            }
//            sb.append("$").append(String.format("%.2f", sum)).append("\n");
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

public class A5361 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        double[] price = {350.34, 230.90, 190.55, 125.30, 180.90};
        int tc = Integer.parseInt(br.readLine());
        for (int i = 0; i < tc; i++) {
            String[] sp = br.readLine().split(" ");
            double sum = 0;
            for (int j = 0; j < sp.length; j++) {
                sum += price[j] * Integer.parseInt(sp[j]);
            }
            sb.append("$").append(String.format("%.2f", sum)).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}
