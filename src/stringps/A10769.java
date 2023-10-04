package stringps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//public class A10769 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String input = br.readLine();
//        String happyE = ":-)";
//        int hCnt = 0;
//        String hs = input;
//        while (hs.contains(happyE)) {
//             if (hs.contains(happyE)) {
//                 hs = hs.substring(hs.indexOf(happyE) + 3);
//                 hCnt++;
//             }
//        }
//        String sadE = ":-(";
//        int sCnt = 0;
//        String ss = input;
//        while (ss.contains(sadE)) {
//            if (ss.contains(sadE)) {
//                ss = ss.substring(ss.indexOf(sadE) + 3);
//                sCnt++;
//            }
//        }
//        if (hCnt == 0 && sCnt == 0) {
//            System.out.println("none");
//        } else if (hCnt > sCnt) {
//            System.out.println("happy");
//        } else if (hCnt == sCnt) {
//            System.out.println("unsure");
//        } else {
//            System.out.println("sad");
//        }
//        br.close();
//    }
//}

public class A10769 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int h = input.length() - input.replace(":-)", "").length();
        int s = input.length() - input.replace(":-(", "").length();
        if (h == 0 && s == 0) {
            System.out.println("none");
        } else if (h > s) {
            System.out.println("happy");
        } else if (h == s) {
            System.out.println("unsure");
        } else {
            System.out.println("sad");
        }
        br.close();
    }
}