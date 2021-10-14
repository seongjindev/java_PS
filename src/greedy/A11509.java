package greedy;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.*;
//
//public class A11509 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int[] arr = new int[n];
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        for (int i = 0; i < n; i++) {
//            arr[i] = Integer.parseInt(st.nextToken());
//        }
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(arr[0]);
//        for (int i = 1; i < n; i++) {
//            boolean chk = false;
//            for (int j = 0; j < list.size(); j++) {
//                if (list.get(j) - 1 == arr[i]) {
//                    list.set(j, arr[i]);
//                    chk = true;
//                    break;
//                }
//            }
//            if (!chk) {
//                list.add(arr[i]);
//            }
//        }
//        System.out.println(list.size());
//        br.close();
//    }
//}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class A11509 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] cnt = new int[1000001];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (cnt[arr[i]+1]>=1) {
                cnt[arr[i]+1]--;
            } else {
                sum++;
            }
            cnt[arr[i]]++;
        }
        System.out.println(sum);
        br.close();
    }
}