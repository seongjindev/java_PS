package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

//public class A9375 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        HashSet<String> hs = new HashSet<>();
//        String in = "";
//        while ((in = br.readLine()) != null && !in.isEmpty()) {
//            if (hs.contains(in)) {
//                hs.remove(in);
//            } else {
//                hs.add(in);
//            }
//        }
//        Iterator<String> iterator = hs.iterator();
//        System.out.println(iterator.next());
//        br.close();
//    }
//}

//public class A9375 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        HashSet<String> hs = new HashSet<>();
//        for (int i = 0; i < n * 2 - 1; i++) {
//            String s = br.readLine();
//            if (hs.contains(s)) hs.remove(s);
//            else hs.add(s);
//        }
//        System.out.println(hs.toArray()[0]);
//        br.close();
//    }
//}

//public class A9375 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        HashMap<String, Integer> hm = new HashMap<>();
//        for (int i = 0; i < n * 2 - 1; i++) {
//            String s = br.readLine();
//            hm.put(s, hm.getOrDefault(s, 0) + 1);
//        }
//        for (String s : hm.keySet()) {
//            if (hm.get(s) % 2 != 0) {
//                System.out.println(s);
//                break;
//            }
//        }
//        br.close();
//    }
//}

public class A9375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<String, Integer> hm = new HashMap<>();
        for (int i = 0; i < n * 2 - 1; i++) {
            String s = br.readLine();
            hm.put(s, hm.getOrDefault(s, 0) + 1);
        }
        for (String s : hm.keySet()) {
            if (hm.get(s) % 2 == 1) {
                System.out.println(s);
                break;
            }
        }
        br.close();
    }
}