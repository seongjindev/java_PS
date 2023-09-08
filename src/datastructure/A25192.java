package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

//public class A25192 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int rst = 0;
//        HashSet<String> hs = new HashSet<>();
//        for (int i = 0; i < n; i++) {
//            String s = br.readLine();
//            if (s.equals("ENTER")) {
//                rst += hs.size();
//                hs = new HashSet<>();
//            } else {
//                hs.add(s);
//            }
//        }
//        rst += hs.size();
//        System.out.println(rst);
//        br.close();
//    }
//}

public class A25192 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int rst = 0;
        HashSet<String> hs = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            if (s.equals("ENTER")) {
                rst += hs.size();
                hs.clear();
            } else {
                hs.add(s);
            }
        }
        rst += hs.size();
        System.out.println(rst);
        br.close();
    }
}