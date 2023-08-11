package sortps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

//public class A5648 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int cnt = 0;
//        long[] arr = new long[n];
//        StringBuilder sb = new StringBuilder();
//        while (cnt != n) {
//            if (st.hasMoreTokens()) {
//                arr[cnt] = Long.parseLong(sb.append(st.nextToken()).reverse().toString());
//                sb.setLength(0);
//                cnt++;
//            } else {
//                st = new StringTokenizer(br.readLine());
//            }
//        }
//        Arrays.sort(arr);
//        for (int i = 0; i < n; i++) {
//            sb.append(arr[i]).append("\n");
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

public class A5648 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(sb.append(sc.next()).reverse().toString());
            sb.setLength(0);
        }
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            sb.append(arr[i]).append("\n");
        }
        System.out.println(sb);
    }
}