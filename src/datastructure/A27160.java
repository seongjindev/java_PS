package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.HashMap;

//public class A27160 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        HashMap<String, Integer> hm = new HashMap<>();
//        for (int i = 0; i < n; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            String fruit = st.nextToken();
//            hm.put(fruit, hm.getOrDefault(fruit, 0) + Integer.parseInt(st.nextToken()));
//        }
//        String rst = "NO";
//        for (String k : hm.keySet()) {
//            if (hm.get(k) == 5) {
//                rst = "YES";
//                break;
//            }
//        }
//        System.out.println(rst);
//        br.close();
//    }
//}

//public class A27160 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        HashMap<String, Integer> hm = new HashMap<>();
//        for (int i = 0; i < n; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            String fruit = st.nextToken();
//            hm.put(fruit, hm.getOrDefault(fruit, 0) + Integer.parseInt(st.nextToken()));
//        }
//        String rst = "NO";
//        for (int k : hm.values()) {
//            if (k == 5) {
//                rst = "YES";
//                break;
//            }
//        }
//        System.out.println(rst);
//        br.close();
//    }
//}

//public class A27160 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        HashMap<String, Integer> hm = new HashMap<>();
//        for (int i = 0; i < n; i++) {
//            String[] sp = br.readLine().split(" ");
//            hm.put(sp[0], hm.getOrDefault(sp[0], 0) + Integer.parseInt(sp[1]));
//        }
//        String rst = "NO";
//        for (int k : hm.values()) {
//            if (k == 5) {
//                rst = "YES";
//                break;
//            }
//        }
//        System.out.println(rst);
//        br.close();
//    }
//}

public class A27160 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] fruit = new int[4];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int num = Integer.parseInt(st.nextToken());
            switch (name) {
                case "STRAWBERRY":
                    fruit[0] += num;
                    break;
                case "BANANA":
                    fruit[1] += num;
                    break;
                case "LIME":
                    fruit[2] += num;
                    break;
                case "PLUM":
                    fruit[3] += num;
                    break;
            }
        }
        String rst = "NO";
        for (int k : fruit) {
            if (k == 5) {
                rst = "YES";
                break;
            }
        }
        System.out.println(rst);
        br.close();
    }
}