package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.StringTokenizer;
import java.util.HashSet;

//public class A14425 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int m = Integer.parseInt(st.nextToken());
//        HashSet<String> hs = new HashSet<>();
//        for (int i = 0; i < n; i++) {
//            hs.add(br.readLine());
//        }
//        int cnt = 0;
//        for (int i = 0; i < m; i++) {
//            if (hs.contains(br.readLine())) {
//                cnt++;
//            }
//        }
//        System.out.println(cnt);
//        br.close();
//    }
//}

public class A14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(br.readLine());
        }
        int cnt = 0;
        for (int i = 0; i < m; i++) {
            if (arr.contains(br.readLine())) {
                cnt++;
            }
        }
        System.out.println(cnt);
        br.close();
    }
}