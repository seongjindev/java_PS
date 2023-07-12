package sortps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.Comparator;

//public class A2535 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int[][] arr = new int[n][3];
//        int[] medal = new int[n];
//        StringTokenizer st;
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < n; i++) {
//            st = new StringTokenizer(br.readLine());
//            arr[i][1] = Integer.parseInt(st.nextToken());
//            arr[i][2] = Integer.parseInt(st.nextToken());
//            arr[i][0] = Integer.parseInt(st.nextToken());
//        }
//        Arrays.sort(arr, new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                return o2[0] - o1[0];
//            }
//        });
//        int cnt = 0;
//        for (int i = 0; i < n; i++) {
//            if (medal[arr[i][1]] < 2) {
//                sb.append(arr[i][1]).append(" ").append(arr[i][2]).append("\n");
//                medal[arr[i][1]]++;
//                cnt++;
//            }
//            if (cnt == 3) {
//                break;
//            }
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

//public class A2535 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int[][] arr = new int[n][3];
//        int[] medal = new int[n];
//        StringTokenizer st;
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < n; i++) {
//            st = new StringTokenizer(br.readLine());
//            arr[i][1] = Integer.parseInt(st.nextToken());
//            arr[i][2] = Integer.parseInt(st.nextToken());
//            arr[i][0] = Integer.parseInt(st.nextToken());
//        }
//        Arrays.sort(arr, (o1, o2) -> o2[0] - o1[0]);
//        int cnt = 0;
//        for (int i = 0; i < n; i++) {
//            if (medal[arr[i][1]] < 2) {
//                sb.append(arr[i][1]).append(" ").append(arr[i][2]).append("\n");
//                medal[arr[i][1]]++;
//                cnt++;
//            }
//            if (cnt == 3) {
//                break;
//            }
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

public class A2535 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][3];
        int[] medal = new int[n];
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            arr[i][2] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr, (o1, o2) -> o2[2] - o1[2]);
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (medal[arr[i][0]] < 2) {
                sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
                medal[arr[i][0]]++;
                cnt++;
            }
            if (cnt == 3) {
                break;
            }
        }
        System.out.println(sb);
        br.close();
    }
}