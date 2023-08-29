package stringps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;

//public class A1544 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        HashSet<String> hs = new HashSet<>();
//        for (int i = 0; i < n; i++) {
//            String in = br.readLine();
//            boolean boo = true;
//            for (int j = 0; j < in.length(); j++) {
//                String ck = in.substring(in.length() - j) + in.substring(0, in.length() - j);
//                if (hs.contains(ck)) {
//                    boo = false;
//                    break;
//                }
//            }
//            if (boo) {
//                hs.add(in);
//            }
//        }
//        System.out.println(hs.size());
//        br.close();
//    }
//}

public class A1544 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<String> lt = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String in = br.readLine();
            boolean ck = true;
            for (String s : lt) {
                if (in.length() == s.length()) {
                    String tot = s + s;
                    if (tot.contains(in)) {
                        ck = false;
                    }
                }
            }
            if (ck) {
                lt.add(in);
            }
        }
        System.out.println(lt.size());
        br.close();
    }
}