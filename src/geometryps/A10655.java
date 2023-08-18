package geometryps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//public class A10655 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        long[][] arr = new long[n][2];
//        arr[0][0] = Long.parseLong(st.nextToken());
//        arr[0][1] = Long.parseLong(st.nextToken());
//        long tot = 0;
//        for (int i = 1; i < n; i++) {
//            st = new StringTokenizer(br.readLine());
//            arr[i][0] = Integer.parseInt(st.nextToken());
//            arr[i][1] = Integer.parseInt(st.nextToken());
//            tot += Math.abs(arr[i - 1][0] - arr[i][0]) + Math.abs(arr[i - 1][1] - arr[i][1]);
//        }
//        long dis = Long.MAX_VALUE;
//        for (int i = 1; i < n - 1; i++) {
//            long chk = tot;
//            chk -= Math.abs(arr[i - 1][0] - arr[i][0]) + Math.abs(arr[i - 1][1] - arr[i][1]);
//            chk -= Math.abs(arr[i][0] - arr[i + 1][0]) + Math.abs(arr[i][1] - arr[i + 1][1]);
//            chk += Math.abs(arr[i - 1][0] - arr[i + 1][0]) + Math.abs(arr[i - 1][1] - arr[i + 1][1]);
//            dis = Math.min(dis, chk);
//        }
//        System.out.println(dis);
//        br.close();
//    }
//}

public class A10655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[][] arr = new int[n][2];
        arr[0][0] = Integer.parseInt(st.nextToken());
        arr[0][1] = Integer.parseInt(st.nextToken());
        int tot = 0;
        for (int i = 1; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            tot += Math.abs(arr[i - 1][0] - arr[i][0]) + Math.abs(arr[i - 1][1] - arr[i][1]);
        }
        int dis = 200000001;
        for (int i = 1; i < n - 1; i++) {
            int chk = tot;
            chk -= Math.abs(arr[i - 1][0] - arr[i][0]) + Math.abs(arr[i - 1][1] - arr[i][1]);
            chk -= Math.abs(arr[i][0] - arr[i + 1][0]) + Math.abs(arr[i][1] - arr[i + 1][1]);
            chk += Math.abs(arr[i - 1][0] - arr[i + 1][0]) + Math.abs(arr[i - 1][1] - arr[i + 1][1]);
            dis = Math.min(dis, chk);
        }
        System.out.println(dis);
        br.close();
    }
}