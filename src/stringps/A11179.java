package stringps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//public class A11179 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        StringBuilder sb = new StringBuilder();
//        sb.append(Integer.toBinaryString(n));
//        String s = sb.reverse().toString();
//        int rst = Integer.parseInt(s, 2);
//        System.out.println(rst);
//        br.close();
//    }
//}

public class A11179 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder(Integer.toBinaryString(n));
        int rst = Integer.parseInt(sb.reverse().toString(), 2);
        System.out.println(rst);
        br.close();
    }
}