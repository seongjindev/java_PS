package sortps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

//public class A20291 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        TreeMap<String, Integer> tm = new TreeMap<>();
//        for (int i = 0; i < n; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine(), ".");
//            st.nextToken();
//            String in = st.nextToken();
//            if (!tm.containsKey(in)) {
//                tm.put(in, 1);
//            } else {
//                tm.put(in, tm.get(in) + 1);
//            }
//        }
//        StringBuilder sb = new StringBuilder();
//        for (String s : tm.keySet()) {
//            sb.append(s).append(" ").append(tm.get(s)).append("\n");
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

public class A20291 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        TreeMap<String, Integer> tm = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), ".");
            st.nextToken();
            String in = st.nextToken();
            tm.put(in, tm.getOrDefault(in, 0) + 1);
        }
        StringBuilder sb = new StringBuilder();
        for (String s : tm.keySet()) {
            sb.append(s).append(" ").append(tm.get(s)).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}