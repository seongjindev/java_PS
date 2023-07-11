package sortps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//public class A15905 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int[][] arr = new int[n][2];
//        StringTokenizer st;
//        for (int i = 0; i < n; i++) {
//            st = new StringTokenizer(br.readLine());
//            arr[i][0] = Integer.parseInt(st.nextToken());
//            arr[i][1] = Integer.parseInt(st.nextToken());
//        }
//        Arrays.sort(arr, (o1, o2) -> {
//            if (o1[0] == o2[0]) {
//                return o2[1] - o1[1];
//            } else {
//                return o2[0] - o1[0];
//            }
//        });
//        int rst = 0;
//        for (int i = 5; i < n; i++) {
//            if (arr[4][0] == arr[i][0]) {
//                rst++;
//            }
//            if (arr[4][0] > arr[i][0]) {
//                break;
//            }
//        }
//        System.out.println(rst);
//        br.close();
//    }
//}

public class A15905 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr, (o1, o2) -> {
            if (o1[0] == o2[0]) {
                return o2[1] - o1[1];
            } else {
                return o2[0] - o1[0];
            }
        });
        int rst = 0;
        for (int i = 5; i < n; i++) {
            if (arr[4][0] == arr[i][0]) {
                rst++;
            } else {
                break;
            }
        }
        System.out.println(rst);
        br.close();
    }
}
