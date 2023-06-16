package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

//public class A1418 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int k = Integer.parseInt(br.readLine());
//        boolean[] pn = new boolean[100001];
//        pn[1] = true;
//        for (int i = 2; i < 100001; i++) {
//            if (!pn[i]) {
//                for (int j = i * 2; j < 100001; j += i) {
//                    pn[j] = true;
//                }
//            }
//        }
//        HashSet<Integer> set = new HashSet<>();
//        for (int i = 2; i <= k; i++) {
//            if (!pn[i]) {
//                for (int j = i; j <= n; j += i) {
//                    set.add(j);
//                }
//            }
//        }
//        for (int i = k + 1; i <= n; i++) {
//            if (!pn[i]) {
//                for (int j = i; j <= n; j+= i) {
//                    set.remove(j);
//                }
//            }
//        }
//        System.out.println(set.size() + 1);
//        br.close();
//    }
//}

public class A1418 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());
        boolean[] pn = new boolean[100001];
        pn[1] = true;
        for (int i = 2; i < 100001; i++) {
            if (!pn[i]) {
                for (int j = i * 2; j < 100001; j += i) {
                    pn[j] = true;
                }
            }
        }
        HashSet<Integer> set = new HashSet<>();
        for (int i = 2; i <= n; i++) {
            if (!pn[i]) {
                if (i <= k) {
                    for (int j = i; j <= n; j += i) {
                        set.add(j);
                    }
                } else {
                    for (int j = i; j <= n; j += i) {
                        set.remove(j);
                    }
                }
            }
        }
        System.out.println(set.size() + 1);
        br.close();
    }
}