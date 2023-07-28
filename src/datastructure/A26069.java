package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

//public class A26069 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        HashSet<String> hs = new HashSet<>();
//        StringTokenizer st;
//        hs.add("ChongChong");
//        for (int i = 0; i < n; i++) {
//            st = new StringTokenizer(br.readLine());
//            String a = st.nextToken();
//            String b = st.nextToken();
//            if (hs.contains(a) || hs.contains(b)) {
//                hs.add(a);
//                hs.add(b);
//            }
//        }
//        System.out.println(hs.size());
//        br.close();
//    }
//}

//public class A26069 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        HashSet<String> hs = new HashSet<>();
//        StringTokenizer st;
//        hs.add("ChongChong");
//        for (int i = 0; i < n; i++) {
//            st = new StringTokenizer(br.readLine());
//            String a = st.nextToken();
//            String b = st.nextToken();
//            if (hs.contains(a)) {
//                hs.add(b);
//            } else if (hs.contains(b)) {
//                hs.add(a);
//            }
//        }
//        System.out.println(hs.size());
//        br.close();
//    }
//}

//public class A26069 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        HashSet<String> hs = new HashSet<>();
//        hs.add("ChongChong");
//        for (int i = 0; i < n; i++) {
//            String[] s = br.readLine().split(" ");
//            if (hs.contains(s[0])) {
//                hs.add(s[1]);
//            }
//            if (hs.contains(s[1])) {
//                hs.add(s[0]);
//            }
//        }
//        System.out.println(hs.size());
//        br.close();
//    }
//}

public class A26069 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashSet<String> hs = new HashSet<>();
        hs.add("ChongChong");
        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            if (hs.contains(s[0])) hs.add(s[1]);
            if (hs.contains(s[1])) hs.add(s[0]);
        }
        System.out.println(hs.size());
        br.close();
    }
}