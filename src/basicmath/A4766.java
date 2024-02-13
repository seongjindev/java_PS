package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//public class A4766 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        double be = Double.parseDouble(br.readLine());
//        while (true) {
//            String s = br.readLine();
//            if (s.equals("999")) {
//                break;
//            }
//            double in = Double.parseDouble(s);
//            sb.append(String.format("%.2f", in - be)).append("\n");
//            be = in;
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

public class A4766 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        double be = Double.parseDouble(br.readLine());
        double af;
        while ((af = Double.parseDouble(br.readLine())) != 999) {
            sb.append(String.format("%.2f", af - be)).append("\n");
            be = af;
        }
        System.out.println(sb);
        br.close();
    }
}