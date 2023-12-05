package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

//public class A2998 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder in = new StringBuilder(br.readLine());
//        HashMap<String, String> bi = new HashMap<>();
//        bi.put("000", "0");
//        bi.put("001", "1");
//        bi.put("010", "2");
//        bi.put("011", "3");
//        bi.put("100", "4");
//        bi.put("101", "5");
//        bi.put("110", "6");
//        bi.put("111", "7");
//        int l = in.length() % 3 == 0 ? 0 : 3 - (in.length() % 3);
//        for (int i = 0; i < l; i++) {
//            in.insert(0, "0");
//        }
//        StringBuilder rst = new StringBuilder();
//        for (int i = 0; i < in.length() / 3; i++) {
//            rst.append(bi.get(in.substring(i * 3, (i * 3) + 3)));
//        }
//        System.out.println(rst);
//        br.close();
//    }
//}

//public class A2998 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder in = new StringBuilder(br.readLine());
//        while (in.length() % 3 != 0) {
//            in.insert(0, "0");
//        }
//        StringBuilder rst = new StringBuilder();
//        for (int i = 0; i < in.length() / 3; i++) {
//            rst.append(Integer.parseInt(in.substring(i * 3, (i * 3) + 3), 2));
//        }
//        System.out.println(rst);
//        br.close();
//    }
//}

public class A2998 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String in = br.readLine();
        while (in.length() % 3 != 0) {
            in = "0" + in;
        }
        StringBuilder rst = new StringBuilder();
        for (int i = 0; i < in.length() / 3; i++) {
            rst.append(Integer.parseInt(in.substring(i * 3, (i * 3) + 3), 2));
        }
        System.out.println(rst);
        br.close();
    }
}