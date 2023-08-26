package stringps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//public class A20920 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int m = Integer.parseInt(st.nextToken());
//        HashSet<String> hs = new HashSet<>();
//        HashMap<String, Integer> hm = new HashMap<>();
//        for (int i = 0; i < n; i++) {
//            String in = br.readLine();
//            if (in.length() < m) continue;
//            hs.add(in);
//            hm.put(in, hm.getOrDefault(in, 1) + 1);
//        }
//        List<String> lt = new ArrayList<>(hs);
//        lt.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                if (hm.get(o1) == hm.get(o2)) {
//                    if (o1.length() == o2.length()) {
//                        return o1.compareTo(o2);
//                    } else {
//                        return o2.length() - o1.length();
//                    }
//                }
//                return hm.get(o2) - hm.get(o1);
//            }
//        });
//        StringBuilder sb = new StringBuilder();
//        for (String s : lt) {
//            sb.append(s).append("\n");
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

//public class A20920 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int m = Integer.parseInt(st.nextToken());
//        HashMap<String, Integer> hm = new HashMap<>();
//        for (int i = 0; i < n; i++) {
//            String in = br.readLine();
//            if (in.length() < m) continue;
//            hm.put(in, hm.getOrDefault(in, 1) + 1);
//        }
//        List<String> lt = new ArrayList<>(hm.keySet());
//        lt.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                if (hm.get(o1) == hm.get(o2)) {
//                    if (o1.length() == o2.length()) {
//                        return o1.compareTo(o2);
//                    } else {
//                        return o2.length() - o1.length();
//                    }
//                }
//                return hm.get(o2) - hm.get(o1);
//            }
//        });
//        StringBuilder sb = new StringBuilder();
//        for (String s : lt) {
//            sb.append(s).append("\n");
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

public class A20920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String in = br.readLine();
            if (in.length() < m) continue;
            hm.put(in, hm.getOrDefault(in, 1) + 1);
        }
        List<String> lt = new ArrayList<>(hm.keySet());
        lt.sort((o1, o2) -> {
            if (hm.get(o1) == hm.get(o2)) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                } else {
                    return o2.length() - o1.length();
                }
            }
            return hm.get(o2) - hm.get(o1);
        });
        StringBuilder sb = new StringBuilder();
        for (String s : lt) {
            sb.append(s).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}