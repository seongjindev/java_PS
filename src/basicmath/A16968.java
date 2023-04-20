package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//public class A16968 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String in = br.readLine();
//        int rst = 1;
//        if (in.charAt(0) == 'd') {
//            rst *= 10;
//        } else {
//            rst *= 26;
//        }
//        for (int i = 1; i < in.length(); i++) {
//            if (in.charAt(i-1) == in.charAt(i)) {
//                if (in.charAt(i) == 'd') {
//                    rst *= 9;
//                } else {
//                    rst *= 25;
//                }
//            } else {
//                if (in.charAt(i) == 'd') {
//                    rst *= 10;
//                } else {
//                    rst *= 26;
//                }
//            }
//        }
//        System.out.println(rst);
//        br.close();
//    }
//}

public class A16968 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String in = br.readLine();
        int rst = in.charAt(0) == 'd' ? 10 : 26;
        int num;
        for (int i = 1; i < in.length(); i++) {
            if (in.charAt(i) == 'd') {
                num = 10;
            } else {
                num = 26;
            }
            if (in.charAt(i) == in.charAt(i-1)) {
                num--;
            }
            rst *= num;
        }
        System.out.println(rst);
        br.close();
    }
}