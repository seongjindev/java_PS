package sortps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

//public class A5576 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        Integer[] w = new Integer[10];
//        Integer[] k = new Integer[10];
//        for (int i = 0; i < 10; i++) {
//            w[i] = Integer.parseInt(br.readLine());
//        }
//        for (int i = 0; i < 10; i++) {
//            k[i] = Integer.parseInt(br.readLine());
//        }
//        Arrays.sort(w, Collections.reverseOrder());
//        Arrays.sort(k, Collections.reverseOrder());
//        int wSum = 0;
//        int kSum = 0;
//        for (int i = 0; i < 3; i++) {
//            wSum += w[i];
//            kSum += k[i];
//        }
//        System.out.println(wSum + " " + kSum);
//        br.close();
//    }
//}

public class A5576 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer[] w = new Integer[10];
        Integer[] k = new Integer[10];
        for (int i = 0; i < 10; i++) {
            w[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < 10; i++) {
            k[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(w, Collections.reverseOrder());
        Arrays.sort(k, Collections.reverseOrder());
        int wSum = w[0] + w[1] + w[2];
        int kSum = k[0] + k[1] + k[2];
        System.out.println(wSum + " " + kSum);
        br.close();
    }
}