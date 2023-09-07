package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

//public class A1620 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int m = Integer.parseInt(st.nextToken());
//        HashMap<String, String> pNum = new HashMap<>();
//        HashMap<String, Integer> pName = new HashMap<>();
//        for (int i = 1; i < n + 1; i++) {
//            String in = br.readLine();
//            pNum.put(String.valueOf(i), in);
//            pName.put(in, i);
//        }
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < m; i++) {
//            String s = br.readLine();
//            if (pName.containsKey(s)) {
//                sb.append(pName.get(s)).append("\n");
//            } else {
//                sb.append(pNum.get(s)).append("\n");
//            }
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

public class A1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashMap<String, String> pHm = new HashMap<>();
        for (int i = 1; i < n + 1; i++) {
            String in = br.readLine();
            String s = String.valueOf(i);
            pHm.put(s, in);
            pHm.put(in, s);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            sb.append(pHm.get(br.readLine())).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}