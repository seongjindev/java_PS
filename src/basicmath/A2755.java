package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

//public class A2755 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        HashMap<String, Double> hm = new HashMap<>();
//        hm.put("A+", 4.3);
//        hm.put("A0", 4.0);
//        hm.put("A-", 3.7);
//        hm.put("B+", 3.3);
//        hm.put("B0", 3.0);
//        hm.put("B-", 2.7);
//        hm.put("C+", 2.3);
//        hm.put("C0", 2.0);
//        hm.put("C-", 1.7);
//        hm.put("D+", 1.3);
//        hm.put("D0", 1.0);
//        hm.put("D-", 0.7);
//        hm.put("F", 0.0);
//        int scoTot = 0;
//        double grade = 0;
//        for (int i = 0; i < n; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            st.nextToken();
//            int score = Integer.parseInt(st.nextToken());
//            scoTot += score;
//            grade += score * hm.get(st.nextToken());
//        }
//        double rst = Math.round((grade / scoTot) * 100) / 100.0;
//        System.out.printf("%.2f", rst);
//        br.close();
//    }
//}

public class A2755 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<String, Double> hm = new HashMap<>();
        hm.put("A+", 4.3);
        hm.put("A0", 4.0);
        hm.put("A-", 3.7);
        hm.put("B+", 3.3);
        hm.put("B0", 3.0);
        hm.put("B-", 2.7);
        hm.put("C+", 2.3);
        hm.put("C0", 2.0);
        hm.put("C-", 1.7);
        hm.put("D+", 1.3);
        hm.put("D0", 1.0);
        hm.put("D-", 0.7);
        hm.put("F", 0.0);
        int scoreTot = 0;
        double grade = 0;
        for (int i = 0; i < n; i++) {
            String[] sp = br.readLine().split(" ");
            scoreTot += Integer.parseInt(sp[1]);
            grade += Integer.parseInt(sp[1]) * hm.get(sp[2]);
        }
        String rst = String.format("%.2f", grade / scoreTot);
        System.out.printf(rst);
        br.close();
    }
}
