package sortps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//public class A1822 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int a = Integer.parseInt(st.nextToken());
//        int b = Integer.parseInt(st.nextToken());
//        HashSet<Integer> hs = new HashSet<>();
//        StringTokenizer st1 = new StringTokenizer(br.readLine());
//        StringTokenizer st2 = new StringTokenizer(br.readLine());
//        StringBuilder sb = new StringBuilder();
//        ArrayList<Integer> al = new ArrayList<>();
//        for (int i = 0; i < b; i++) {
//            hs.add(Integer.parseInt(st2.nextToken()));
//        }
//        int hsSize = hs.size();
//        int cnt = 0;
//        for (int i = 0; i < a; i++) {
//            int aNum = Integer.parseInt(st1.nextToken());
//            hs.add(aNum);
//            if (hs.size() > hsSize) {
//                al.add(aNum);
//                cnt++;
//            }
//            hsSize = hs.size();
//        }
//        Collections.sort(al);
//        sb.append(cnt).append("\n");
//        for (int i : al) {
//            sb.append(i).append(" ");
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

public class A1822 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        HashSet<Integer> hs = new HashSet<>();
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < b; i++) {
            hs.add(Integer.parseInt(st2.nextToken()));
        }
        int cnt = 0;
        for (int i = 0; i < a; i++) {
            int aNum = Integer.parseInt(st1.nextToken());
            if (!hs.contains(aNum)) {
                al.add(aNum);
                cnt++;
            }
        }
        Collections.sort(al);
        sb.append(cnt).append("\n");
        for (int i : al) {
            sb.append(i).append(" ");
        }
        System.out.println(sb);
        br.close();
    }
}