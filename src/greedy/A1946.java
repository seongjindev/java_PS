package greedy;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Arrays;
//import java.util.Comparator;
//import java.util.StringTokenizer;
//
//public class A1946 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int tc = Integer.parseInt(br.readLine());
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < tc; i++) {
//            int n = Integer.parseInt(br.readLine());
//            int[][] arr = new int[n][2];
//            int inter = 0;
//            int sum = 0;
//            for (int j = 0; j < n; j++) {
//                StringTokenizer st = new StringTokenizer(br.readLine());
//                arr[j][0] = Integer.parseInt(st.nextToken());
//                arr[j][1] = Integer.parseInt(st.nextToken());
//            }
//            Arrays.sort(arr, new Comparator<int[]>() {
//                @Override
//                public int compare(int[] o1, int[] o2) {
//                    if (o1[0]==o2[0]) {
//                        return Integer.compare(o1[1], o2[1]);
//                    }else {
//                        return Integer.compare(o1[0], o2[0]);
//                    }
//                }
//            });
//            inter = arr[0][1];
//            for (int k = 0; k < n; k++) {
//                if (arr[k][1] <= inter) {
//                    sum++;
//                    inter = arr[k][1];
//                }
//                if (arr[k][1] == 1) {
//                    break;
//                }
//            }
//            sb.append(sum + "\n");
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A1946 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tc; i++) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n+1];
            int inter = 0;
            int sum = 0;
            for (int j = 0; j < n; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                arr[Integer.parseInt(st.nextToken())] = Integer.parseInt(st.nextToken());
            }
            inter = arr[1];
            for (int k = 1; k <= n; k++) {
                if (arr[k] <= inter) {
                    sum++;
                    inter = arr[k];
                }
                if (arr[k] == 1) {
                    break;
                }
            }
            sb.append(sum + "\n");
        }
        System.out.println(sb);
        br.close();
    }
}

