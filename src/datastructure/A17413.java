package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//public class A17413 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        String in = br.readLine();
//        boolean chk = false;
//        String rst = "";
//        for (int i = 0; i < in.length(); i++) {
//            if (in.charAt(i) == '<') {
//                if (sb.length() != 0) {
//                    rst += sb.reverse();
//                    sb.setLength(0);
//                }
//                rst += "<";
//                chk = true;
//            } else if (in.charAt(i) == '>') {
//                rst += in.charAt(i);
//                chk = false;
//            } else if (chk) {
//                rst += in.charAt(i);
//            } else if (in.charAt(i) == ' '){
//                rst += sb.reverse().append(" ");
//                sb.setLength(0);
//            } else {
//                sb.append(in.charAt(i));
//            }
//        }
//        rst += sb.reverse().append(" ");
//        sb.setLength(0);
//        System.out.println(rst);
//        br.close();
//    }
//}

public class A17413 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringBuilder rst = new StringBuilder();
        String in = br.readLine();
        boolean chk = false;
        for (int i = 0; i < in.length(); i++) {
            if (in.charAt(i) == '<') {
                if (sb.length() != 0) {
                    rst.append(sb.reverse());
                    sb.setLength(0);
                }
                rst.append("<");
                chk = true;
            } else if (in.charAt(i) == '>') {
                rst.append(in.charAt(i));
                chk = false;
            } else if (chk) {
                rst.append(in.charAt(i));
            } else if (in.charAt(i) == ' '){
                rst.append(sb.reverse().append(" "));
                sb.setLength(0);
            } else {
                sb.append(in.charAt(i));
            }
        }
        rst.append(sb.reverse().append(" "));
        System.out.println(rst);
        br.close();
    }
}