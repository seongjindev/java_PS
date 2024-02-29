package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.StringTokenizer;

//public class A9610 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int q1 = 0;
//        int q2 = 0;
//        int q3 = 0;
//        int q4 = 0;
//        int axis = 0;
//        int n = Integer.parseInt(br.readLine());
//        for (int i = 0; i < n; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            int x = Integer.parseInt(st.nextToken());
//            int y = Integer.parseInt(st.nextToken());
//            if (x == 0 || y == 0) {
//                axis++;
//            } else if (x > 0 && y > 0) {
//                q1++;
//            } else if (x > 0) {
//                q4++;
//            } else if (y > 0) {
//                q2++;
//            } else {
//                q3++;
//            }
//        }
//        System.out.println("Q1: " + q1 + "\n" + "Q2: " + q2 + "\n" + "Q3: " + q3 + "\n" + "Q4: " + q4 + "\n" + "AXIS: " + axis);
//        br.close();
//    }
//}

public class A9610 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> hm = new LinkedHashMap<>();
        hm.put("Q1", 0);
        hm.put("Q2", 0);
        hm.put("Q3", 0);
        hm.put("Q4", 0);
        hm.put("AXIS", 0);
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            if (x == 0 || y == 0) {
                hm.put("AXIS", hm.get("AXIS") + 1);
            } else if (x > 0 && y > 0) {
                hm.put("Q1", hm.get("Q1") + 1);
            } else if (x > 0) {
                hm.put("Q4", hm.get("Q4") + 1);
            } else if (y > 0) {
                hm.put("Q2", hm.get("Q2") + 1);
            } else {
                hm.put("Q3", hm.get("Q3") + 1);
            }
        }
        for (String s : hm.keySet()) {
            System.out.println(s + ": " + hm.get(s));
        }
        br.close();
    }
}
