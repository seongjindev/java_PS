package sortps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Arrays;

//public class A11931 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        Integer[] box = new Integer[n];
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < n; i++) {
//            box[i] = Integer.parseInt(br.readLine());
//        }
//        Arrays.sort(box, Comparator.reverseOrder());
//        for (int i = 0; i < n; i++) {
//            sb.append(box[i]).append("\n");
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

//public class A11931 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int[] box = new int[2000001];
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < n; i++) {
//            box[Integer.parseInt(br.readLine()) + 1000000]++;
//        }
//        for (int i = 2000000; i >= 0; i--) {
//            if (box[i] > 0) {
//                sb.append(i - 1000000).append("\n");
//            }
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

public class A11931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            arr.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(arr, Comparator.reverseOrder());
        for (int i = 0; i < n; i++) {
            sb.append(arr.get(i)).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}