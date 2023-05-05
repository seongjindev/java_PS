package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

//public class A1094 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        ArrayList<Integer> bar = new ArrayList<>();
//        bar.add(64);
//        while (true) {
//            int sum = 0;
//            int cnt = 0;
//            for (int i = 0; i < bar.size(); i++) {
//                sum += bar.get(i);
//                cnt++;
//            }
//            if (sum == n) {
//                System.out.println(cnt);
//                break;
//            }
//            Collections.sort(bar);
//            int sum2 = bar.get(0) / 2;
//            for (int i = 1; i < bar.size(); i++) {
//                sum2 += bar.get(i);
//            }
//            bar.add(bar.get(0) / 2);
//            if (sum2 < n) {
//                bar.add(bar.get(0) / 2);
//            }
//            bar.remove(0);
//        }
//        br.close();
//    }
//}

//public class A1094 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        ArrayList<Integer> bar = new ArrayList<>();
//        bar.add(64);
//        while (true) {
//            int sum = 0;
//            for (int i : bar) {
//                sum += i;
//            }
//            if (sum == n) {
//                System.out.println(bar.size());
//                break;
//            }
//            Collections.sort(bar);
//            int sum2 = bar.get(0) / 2;
//            for (int i = 1; i < bar.size(); i++) {
//                sum2 += bar.get(i);
//            }
//            bar.add(bar.get(0) / 2);
//            if (sum2 < n) {
//                bar.add(bar.get(0) / 2);
//            }
//            bar.remove(0);
//        }
//        br.close();
//    }
//}

public class A1094 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int bar = 64;
        int rst = 1;
        int barSum = 64;
        while (n != barSum) {
            bar /= 2;
            barSum -= bar;
            if (barSum < n) {
                barSum += bar;
                rst++;
            }
        }
        System.out.println(rst);
        br.close();
    }
}
