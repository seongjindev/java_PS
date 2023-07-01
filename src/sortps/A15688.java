package sortps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//public class A15688 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int[] arr = new int[2000001];
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < n; i++) {
//            arr[Integer.parseInt(br.readLine()) + 1000000]++;
//        }
//        for (int i = 0; i < 2000001; i++) {
//            for (int j = 0; j < arr[i]; j++) {
//                sb.append(i - 1000000).append("\n");
//            }
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

public class A15688 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            sb.append(arr[i]).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}