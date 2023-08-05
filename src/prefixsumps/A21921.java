package prefixsumps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//public class A21921 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int x = Integer.parseInt(st.nextToken());
//        int[] arr = new int[n + 1];
//        st = new StringTokenizer(br.readLine());
//        for (int i = 1; i <= n; i++) {
//            arr[i] = arr[i - 1] + Integer.parseInt(st.nextToken());
//        }
//        int max = 0;
//        int cnt = 0;
//        for (int i = x; i <= n; i++) {
//            int chk = arr[i] - arr[i - x];
//            if (chk > max) {
//                max = chk;
//                cnt = 1;
//            } else if (chk == max) {
//                cnt++;
//            }
//        }
//        if (max == 0) {
//            System.out.println("SAD");
//        } else {
//            System.out.println(max + "\n" + cnt);
//        }
//        br.close();
//    }
//}

public class A21921 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int[] arr = new int[n + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            arr[i] = arr[i - 1] + Integer.parseInt(st.nextToken());
        }
        int max = 0;
        int cnt = 0;
        for (int i = x; i <= n; i++) {
            int chk = arr[i] - arr[i - x];
            if (chk > max) {
                max = chk;
                cnt = 1;
            } else if (chk == max) {
                cnt++;
            }
        }
        if (max == 0) {
            System.out.println("SAD");
        } else {
            System.out.println(max);
            System.out.println(cnt);
        }
        br.close();
    }
}