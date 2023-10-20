package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

//public class A27964 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        HashSet<String> hs = new HashSet<>();
//        for (int i = 0; i < n; i++) {
//            hs.add(st.nextToken());
//        }
//        int cnt = 0;
//        for (String s : hs) {
//            if (s.endsWith("Cheese")) {
//                cnt++;
//            }
//        }
//        if (cnt >= 4) {
//            System.out.println("yummy");
//        } else {
//            System.out.println("sad");
//        }
//        br.close();
//    }
//}

//public class A27964 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        HashSet<String> hs = new HashSet<>();
//        for (int i = 0; i < n; i++) {
//            String s = st.nextToken();
//            if (s.endsWith("Cheese")) {
//                hs.add(s);
//            }
//        }
//        if (hs.size() >= 4) {
//            System.out.println("yummy");
//        } else {
//            System.out.println("sad");
//        }
//        br.close();
//    }
//}

public class A27964 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashSet<String> hs = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String s = st.nextToken();
            if (s.endsWith("Cheese")) {
                hs.add(s);
            }
        }
        String rst = hs.size() >= 4 ? "yummy" : "sad";
        System.out.println(rst);
        br.close();
    }
}