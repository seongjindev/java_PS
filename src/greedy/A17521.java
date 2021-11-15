package greedy;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//public class A17521 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        long w = Integer.parseInt(st.nextToken());
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = Integer.parseInt(br.readLine());
//        }
//        for (int i = 0; i < n-1; i++) {
//            if (arr[i] < arr[i+1]) {
//                int max = 0;
//                for (int j = i + 1; j < n; j++) {
//                    if (arr[j] > max) {
//                        max = arr[j];
//                    }
//                    if (j == n-1 || arr[j] < max){
//                        w = (w / arr[i] * max) + w % arr[i];
//                        i = j-1;
//                        break;
//                    }
//                }
//            }
//        }
//        System.out.println(w);
//        br.close();
//    }
//}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A17521 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        long w = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        long coin = 0;
        for (int i = 0; i < n-1; i++) {
            if (arr[i] < arr[i+1]) {
                coin += w/arr[i];
                w = w%arr[i];
            }else {
                w += coin * arr[i];
                coin = 0;
            }
        }
        w += coin * arr[n-1];
        System.out.println(w);
        br.close();
    }
}
