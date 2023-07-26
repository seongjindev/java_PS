package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

//public class A1269 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int a = Integer.parseInt(st.nextToken());
//        int b = Integer.parseInt(st.nextToken());
//        HashSet<Integer> hs = new HashSet<>();
//        st = new StringTokenizer(br.readLine());
//        for (int i = 0; i < a; i++) {
//            hs.add(Integer.parseInt(st.nextToken()));
//        }
//        st = new StringTokenizer(br.readLine());
//        for (int i = 0; i < b; i++) {
//            hs.add(Integer.parseInt(st.nextToken()));
//        }
////        int i = (hs.size() - b) + b - (a - (hs.size() - b));
//        int rst = hs.size() - b - a + hs.size();
//        System.out.println(rst);
//        br.close();
//    }
//}

//public class A1269 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int a = Integer.parseInt(st.nextToken());
//        int b = Integer.parseInt(st.nextToken());
//        HashSet<Integer> hs = new HashSet<>();
//        st = new StringTokenizer(br.readLine());
//        for (int i = 0; i < a; i++) {
//            hs.add(Integer.parseInt(st.nextToken()));
//        }
//        st = new StringTokenizer(br.readLine());
//        for (int i = 0; i < b; i++) {
//            hs.add(Integer.parseInt(st.nextToken()));
//        }
//        int rst = hs.size() * 2 - b - a;
//        System.out.println(rst);
//        br.close();
//    }
//}

//public class A1269 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int a = Integer.parseInt(st.nextToken());
//        int b = Integer.parseInt(st.nextToken());
//        HashSet<Integer> Ahs = new HashSet<>();
//        HashSet<Integer> Bhs = new HashSet<>();
//        st = new StringTokenizer(br.readLine());
//        for (int i = 0; i < a; i++) {
//            Ahs.add(Integer.parseInt(st.nextToken()));
//        }
//        st = new StringTokenizer(br.readLine());
//        for (int i = 0; i < b; i++) {
//            Bhs.add(Integer.parseInt(st.nextToken()));
//        }
//        int cnt = 0;
//        for (int i : Ahs) {
//            if (Bhs.contains(i)) {
//                cnt++;
//            }
//        }
//        int rst = a + b - 2 * cnt;
//        System.out.println(rst);
//        br.close();
//    }
//}

public class A1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        HashSet<Integer> hs = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < a; i++) {
            hs.add(Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < b; i++) {
            int in = Integer.parseInt(st.nextToken());
            if (hs.contains(in)) {
                hs.remove(in);
            } else {
                hs.add(in);
            }
        }
        System.out.println(hs.size());
        br.close();
    }
}