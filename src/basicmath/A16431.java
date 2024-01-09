package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//public class A16431 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int[][] dis = new int[3][2];
//        StringTokenizer st;
//        for (int i = 0; i < 3; i++) {
//            st = new StringTokenizer(br.readLine());
//            dis[i][0] = Integer.parseInt(st.nextToken());
//            dis[i][1] = Integer.parseInt(st.nextToken());
//        }
//        int bsrJr = Math.abs(dis[0][0] - dis[2][0]);
//        int bsrJc = Math.abs(dis[0][1] - dis[2][1]);
//        int bjMin = Math.min(bsrJr, bsrJc);
//        int bj = bsrJr + bsrJc - bjMin;
//        int dj = Math.abs(dis[1][0] - dis[2][0]) + Math.abs(dis[1][1] - dis[2][1]);
//        System.out.println(bj == dj ? "tie" : bj > dj ? "daisy" : "bessie");
//        br.close();
//    }
//}

public class A16431 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] dis = new int[3][2];
        StringTokenizer st;
        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            dis[i][0] = Integer.parseInt(st.nextToken());
            dis[i][1] = Integer.parseInt(st.nextToken());
        }
        int bj = Math.max(Math.abs(dis[0][0] - dis[2][0]), Math.abs(dis[0][1] - dis[2][1]));
        int dj = Math.abs(dis[1][0] - dis[2][0]) + Math.abs(dis[1][1] - dis[2][1]);
        System.out.println(bj == dj ? "tie" : bj > dj ? "daisy" : "bessie");
        br.close();
    }
}