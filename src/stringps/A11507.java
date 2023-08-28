package stringps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;

//public class A11507 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String in = br.readLine();
//        HashMap<String, Integer> hm = new LinkedHashMap<>();
//        hm.put("P", 13);
//        hm.put("K", 13);
//        hm.put("H", 13);
//        hm.put("T", 13);
//        boolean chk = false;
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < in.length(); i += 3) {
//            String ck = in.substring(i, i + 3);
//            if (in.substring(i + 3).contains(ck)) {
//                chk = true;
//                break;
//            }
//            String card = ck.substring(0, 1);
//            hm.put(card, hm.get(card) - 1);
//        }
//        if (chk) {
//            System.out.println("GRESKA");
//        } else {
//            for (int i : hm.values()) {
//                sb.append(i).append(" ");
//            }
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

//public class A11507 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String in = br.readLine();
//        HashMap<Character, Integer> hm = new LinkedHashMap<>();
//        hm.put('P', 13);
//        hm.put('K', 13);
//        hm.put('H', 13);
//        hm.put('T', 13);
//        boolean chk = false;
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < in.length(); i += 3) {
//            String ck = in.substring(i, i + 3);
//            if (in.substring(i + 3).contains(ck)) {
//                chk = true;
//                break;
//            }
//            char c = ck.charAt(0);
//            hm.put(c, hm.get(c) - 1);
//        }
//        if (chk) {
//            System.out.println("GRESKA");
//        } else {
//            for (int i : hm.values()) {
//                sb.append(i).append(" ");
//            }
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

public class A11507 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String in = br.readLine();
        HashMap<Character, Integer> hm = new LinkedHashMap<>();
        hm.put('P', 13);
        hm.put('K', 13);
        hm.put('H', 13);
        hm.put('T', 13);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < in.length(); i += 3) {
            String ck = in.substring(i, i + 3);
            if (in.substring(i + 3).contains(ck)) {
                System.out.println("GRESKA");
                return;
            }
            char c = ck.charAt(0);
            hm.put(c, hm.get(c) - 1);
        }
        for (int i : hm.values()) {
            sb.append(i).append(" ");
        }
        System.out.println(sb);
        br.close();
    }
}