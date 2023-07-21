package geometryps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//public class A17247 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int m = Integer.parseInt(st.nextToken());
//        int[][] arr = new int[n][m];
//        int[][] chk = new int[2][2];
//        int num = 0;
//        for (int i = 0; i < n; i++) {
//            st = new StringTokenizer(br.readLine());
//            for (int j = 0; j < m; j++) {
//                arr[i][j] = Integer.parseInt(st.nextToken());
//                if (arr[i][j] == 1) {
//                    chk[num][0] = i;
//                    chk[num][1] = j;
//                    num++;
//                }
//            }
//        }
//        int dis = Math.abs(chk[1][0] - chk[0][0]) + Math.abs(chk[1][1] - chk[0][1]);
//        System.out.println(dis);
//        br.close();
//    }
//}

public class A17247 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] chk = new int[2][2];
        int num = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                if (Integer.parseInt(st.nextToken()) == 1) {
                    chk[num][0] = i;
                    chk[num][1] = j;
                    num++;
                }
            }
        }
        int dis = Math.abs(chk[1][0] - chk[0][0]) + Math.abs(chk[1][1] - chk[0][1]);
        System.out.println(dis);
        br.close();
    }
}
