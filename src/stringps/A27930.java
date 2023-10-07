package stringps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//public class A27930 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String ys = "YONSEI";
//        String kr = "KOREA";
//        int ysn = 0;
//        int krn = 0;
//        String rst = "";
//        String input = br.readLine();
//        for (int i = 0; i < input.length(); i++) {
//            char ch = input.charAt(i);
//            if (ch == ys.charAt(ysn)) {
//                ysn++;
//            }
//            if (ch == kr.charAt(krn)) {
//                krn++;
//            }
//            if (ysn == 6) {
//                rst = ys;
//                break;
//            }
//            if (krn == 5) {
//                rst = kr;
//                break;
//            }
//        }
//        System.out.println(rst);
//        br.close();
//    }
//}

//public class A27930 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String ys = "YONSEI";
//        String kr = "KOREA";
//        int ysn = 0;
//        int krn = 0;
//        String rst = "";
//        String input = br.readLine();
//        for (int i = 0; i < input.length(); i++) {
//            char ch = input.charAt(i);
//            if (ch == ys.charAt(ysn)) {
//                ysn++;
//                if (ysn == 6) {
//                    rst = ys;
//                    break;
//                }
//            }
//            if (ch == kr.charAt(krn)) {
//                krn++;
//                if (krn == 5) {
//                    rst = kr;
//                    break;
//                }
//            }
//        }
//        System.out.println(rst);
//        br.close();
//    }
//}

public class A27930 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] ys = {'Y', 'O', 'N', 'S', 'E', 'I'};
        char[] kr = {'K', 'O', 'R', 'E', 'A'};
        int ysn = 0;
        int krn = 0;
        String input = br.readLine();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == ys[ysn]) {
                ysn++;
                if (ysn == 6) {
                    System.out.println("YONSEI");
                    break;
                }
            }
            if (ch == kr[krn]) {
                krn++;
                if (krn == 5) {
                    System.out.println("KOREA");
                    break;
                }
            }
        }
        br.close();
    }
}