package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.util.HashMap;

//public class A25757 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        String in = st.nextToken();
//        HashMap<String, Integer> hm = new HashMap<>();
//        hm.put("Y", 1);
//        hm.put("F", 2);
//        hm.put("O", 3);
//        HashSet<String> hs = new HashSet<>();
//        for (int i = 0; i < n; i++) {
//            hs.add(br.readLine());
//        }
//        System.out.println(hs.size() / hm.get(in));
//        br.close();
//    }
//}

public class A25757 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        String in = st.nextToken();
        HashSet<String> hs = new HashSet<>();
        for (int i = 0; i < n; i++) {
            hs.add(br.readLine());
        }
        int rst = hs.size();
        if (in.equals("F")) rst = hs.size() / 2;
        if (in.equals("O")) rst = hs.size() / 3;
        System.out.println(rst);
        br.close();
    }
}