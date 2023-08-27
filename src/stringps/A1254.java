package stringps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//public class A1254 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String in = br.readLine();
//        int inLen = in.length();
//        int st;
//        if (inLen % 2 == 0) {
//            st = (inLen / 2) - 1;
//        } else {
//            st = inLen / 2;
//        }
//        int rst = 101;
//        for (int i = st; i < inLen; i++) {
//            boolean ck = true;
//            String chk1 = in.substring(0, i);
//            String chk2 = in.substring(i + 1);
//            if (chk1.length() >= chk2.length()) {
//                for (int j = 0; j < chk2.length(); j++) {
//                    if (!chk1.substring(chk1.length() - 1 - j, chk1.length() - j).equals(chk2.substring(j, 1 + j))) {
//                        ck = false;
//                        break;
//                    }
//                }
//                if (ck) {
//                    rst = (chk1.length() * 2) + 1;
//                }
//            }
//            boolean ck2 = true;
//            chk1 = in.substring(0, i + 1);
//            chk2 = in.substring(i + 1);
//            for (int j = 0; j < chk2.length(); j++) {
//                if (!chk1.substring(chk1.length() - 1 - j, chk1.length() - j).equals(chk2.substring(j, 1 + j))) {
//                    ck2 = false;
//                    break;
//                }
//            }
//            if (ck2) {
//                rst = Math.min((chk1.length() * 2), rst);
//            }
//            if (rst != 101) {
//                break;
//            }
//        }
//        System.out.println(rst);
//        br.close();
//    }
//}

public class A1254 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String in = br.readLine();
        int rst = in.length();
        for (int i = 0; i < in.length(); i++) {
            String chk = in.substring(i);
            boolean tf = true;
            int st = 0;
            int ed = chk.length();
            while (st <= ed) {
                if (chk.charAt(st) != chk.charAt(ed - 1)) {
                    tf = false;
                    break;
                }
                st++;
                ed--;
            }
            if (tf) {
                break;
            }
            rst++;
        }
        System.out.println(rst);
        br.close();
    }
}