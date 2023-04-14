package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//public class A10448 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int[] gus = new int[45];
//        for (int i = 1; i < 45; i++) {
//            gus[i] = (i * (i + 1))/2;
//        }
//        for (int i = 0; i < n; i++) {
//            int in = Integer.parseInt(br.readLine());
//            boolean tag = true;
//            Loop:
//            for (int j = 1; j < 45; j++) {
//                for (int k = 1; k < 45; k++) {
//                    for (int l = 1; l < 45; l++) {
//                        if (in == gus[j] + gus[k] + gus[l]) {
//                            System.out.println(1);
//                            tag = false;
//                            break Loop;
//                        }
//                    }
//                }
//            }
//            if (tag) {
//                System.out.println(0);
//            }
//        }
//        br.close();
//    }
//}

public class A10448 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] gus = new int[45];
        for (int i = 1; i < 45; i++) {
            gus[i] = (i * (i + 1))/2;
        }
        boolean[] sum = new boolean[5000];
        for (int i = 1; i < 45; i++) {
            for (int j = 1; j < 45; j++) {
                for (int k = 1; k < 45; k++) {
                    sum[gus[i] + gus[j] + gus[k]] = true;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            int in = Integer.parseInt(br.readLine());
            if (sum[in]) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
        br.close();
    }
}