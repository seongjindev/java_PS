package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

//public class A8891 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int t = Integer.parseInt(br.readLine());
//        StringTokenizer st;
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < t; i++) {
//            st = new StringTokenizer(br.readLine());
//            int a = Integer.parseInt(st.nextToken());
//            int b = Integer.parseInt(st.nextToken());
//            int num = 0;
//            int seq = 1;
//            int x = 0;
//            int y = 0;
//            boolean aChk = false;
//            boolean bChk = false;
//            boolean rst = false;
//            while (true) {
//                int re = seq;
//                for (int j = 1; j <= seq; j++) {
//                    num++;
//                    if (num == a) {
//                        x += j;
//                        y += re;
//                        aChk = true;
//                    }
//                    if (num == b) {
//                        x += j;
//                        y += re;
//                        bChk = true;
//                    }
//                    if (aChk && bChk) {
//                        if (x == j && y == re) {
//                            sb.append(num).append("\n");
//                            rst = true;
//                            break;
//                        }
//                    }
//                    re--;
//                }
//                if (aChk && bChk && rst) {
//                    break;
//                }
//                seq++;
//            }
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

public class A8891 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringTokenizer st1;
        StringBuilder sb = new StringBuilder();
        int[][] point = new int[300][300];
        HashMap<Integer, String> hm = new HashMap<>();
        int num = 0;
        int seq = 1;
        while (seq < 300) {
            int re = seq;
            for (int i = 1; i <= seq; i++) {
                num++;
                point[i][re] = num;
                hm.put(num, i + " " + re);
                re--;
            }
            seq++;
        }
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            int x = 0;
            int y = 0;
            for (int j = 0; j < 2; j++) {
                st1 = new StringTokenizer(hm.get(Integer.parseInt(st.nextToken())));
                x += Integer.parseInt(st1.nextToken());
                y += Integer.parseInt(st1.nextToken());
            }
            sb.append(point[x][y]).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}

