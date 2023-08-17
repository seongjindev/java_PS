package stringps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//public class A4889 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int cnt = 1;
//        StringBuilder sb = new StringBuilder();
//        while (true) {
//            String in = br.readLine();
//            if (in.contains("-")) {
//                break;
//            }
//            int lt = 0;
//            int rt = 0;
//            char[] ch = in.toCharArray();
//            for (char c : ch) {
//                if (c == '{') {
//                    rt++;
//                } else {
//                    if (rt == 0) {
//                        lt++;
//                    } else {
//                        rt--;
//                    }
//                }
//            }
//            int rst = 0;
//            rst += lt % 2;
//            rst += rt % 2;
//            rst += lt / 2;
//            rst += rt / 2;
//            sb.append(cnt).append(". ").append(rst).append("\n");
//            cnt++;
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

public class A4889 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 1;
        StringBuilder sb = new StringBuilder();
        while (true) {
            String in = br.readLine();
            if (in.contains("-")) {
                break;
            }
            int lt = 0;
            int rt = 0;
            char[] ch = in.toCharArray();
            for (char c : ch) {
                if (c == '{') {
                    rt++;
                } else {
                    if (rt == 0) {
                        lt++;
                    } else {
                        rt--;
                    }
                }
            }
            int rst = (lt % 2) + (rt % 2) + (lt / 2) + (rt / 2);
            sb.append(cnt).append(". ").append(rst).append("\n");
            cnt++;
        }
        System.out.println(sb);
        br.close();
    }
}

//테스트 데이터
//}{
//{}{}{}
//{{{}
//}}{{{{
//}}{{
//}}}{{{
//}}{}}}
//---