package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//public class A13300 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int k = Integer.parseInt(st.nextToken());
//        int cnt = 0;
//        int[][] stn = new int[2][7];
//        for (int i = 0; i < n; i++) {
//            st = new StringTokenizer(br.readLine());
//            stn[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())]++;
//        }
//        for (int i = 0; i < 2; i++) {
//            for (int j = 1; j < 7; j++) {
//                if (stn[i][j] >= 1) {
//                    if (stn[i][j] / k == 0) {
//                        cnt++;
//                    }else if (stn[i][j] % k == 0){
//                        cnt += stn[i][j] / k;
//                    }else {
//                        cnt += stn[i][j] / k;
//                        cnt++;
//                    }
//                }
//            }
//        }
//        System.out.println(cnt);
//        br.close();
//    }
//}

//public class A13300 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int k = Integer.parseInt(st.nextToken());
//        int cnt = 0;
//        int[][] stn = new int[2][7];
//        for (int i = 0; i < n; i++) {
//            st = new StringTokenizer(br.readLine());
//            stn[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())]++;
//        }
//        for (int i = 0; i < 2; i++) {
//            for (int j = 1; j < 7; j++) {
//                cnt += Math.ceil(stn[i][j] / (double)k);
//            }
//        }
//        System.out.println(cnt);
//        br.close();
//    }
//}

public class A13300 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int cnt = 0;
        int[][] stn = new int[2][7];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            stn[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())]++;
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 1; j < 7; j++) {
                cnt += stn[i][j] / k;
                if (stn[i][j] % k > 0) cnt++;
            }
        }
        System.out.println(cnt);
        br.close();
    }
}
