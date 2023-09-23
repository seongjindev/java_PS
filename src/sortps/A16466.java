package sortps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.TreeSet;

//public class A16466 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        TreeSet<Integer> ts = new TreeSet<>();
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        for (int i = 0; i < n; i++) {
//            ts.add(Integer.parseInt(st.nextToken()));
//        }
//        int min = 1;
//        for (Integer i : ts) {
//            if (i == min) {
//                min++;
//            } else {
//                break;
//            }
//        }
//        System.out.println(min);
//        br.close();
//    }
//}

//public class A16466 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int[] arr = new int[n + 1];
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        for (int i = 0; i < n; i++) {
//            int num = Integer.parseInt(st.nextToken());
//            if (num <= n) {
//                arr[num]++;
//            }
//        }
//        int min = n + 1;
//        for (int i = 1; i < n + 1; i++) {
//            if (arr[i] == 0) {
//                min = i;
//                break;
//            }
//        }
//        System.out.println(min);
//        br.close();
//    }
//}

public class A16466 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int min = 1;
        for (int i = 0; i < n; i++) {
            if (min == arr[i]) {
                min++;
            } else {
                break;
            }
        }
        System.out.println(min);
        br.close();
    }
}