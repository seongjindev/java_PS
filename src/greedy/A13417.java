package greedy;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.*;
//
//public class A13417 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int tc = Integer.parseInt(br.readLine());
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < tc; i++) {
//            int n = Integer.parseInt(br.readLine());
//            char[] chars = br.readLine().replace(" ","").toCharArray();
//            List<Character> list = new ArrayList<>();
//            String rst = "";
//            list.add(chars[0]);
//            char fir = chars[0];
//            for (int j = 1; j < n; j++) {
//                if (fir >= chars[j] && chars[j] <= list.get(0)) {
//                    list.add(0, chars[j]);
//                } else {
//                    list.add(chars[j]);
//                }
//            }
//            for (char s : list) {
//                rst += s;
//            }
//            sb.append(rst + "\n");
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A13417 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tc; i++) {
            int n = Integer.parseInt(br.readLine());
            char[] chars = br.readLine().replace(" ","").toCharArray();
            String rst = chars[0] + "";
            char fir = chars[0];
            for (int j = 1; j < n; j++) {
                if (fir >= chars[j] && chars[j] <= rst.charAt(0)) {
                    rst = chars[j] + rst;
                } else {
                    rst += chars[j];
                }
            }
            sb.append(rst + "\n");
        }
        System.out.println(sb);
        br.close();
    }
}
