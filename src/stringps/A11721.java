package stringps;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class A11721 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String in = br.readLine();
//        int len = in.length();
//        int cnt = len/10;
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < cnt; i++) {
//            sb.append(in, i*10, (i+1)*10).append("\n");
//        }
//        if (len % 10 != 0) {
//            sb.append(in, cnt*10, len);
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A11721 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String in = br.readLine();
        int len = in.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            sb.append(in.charAt(i));
            if (i % 10 == 9) {
                sb.append("\n");
            }
        }
        System.out.println(sb);
        br.close();
    }
}
