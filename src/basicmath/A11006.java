package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//public class A11006 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        int t = Integer.parseInt(br.readLine());
//        for (int i = 0; i < t; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            int n = Integer.parseInt(st.nextToken());
//            int m = Integer.parseInt(st.nextToken());
//            for (int j = 0; j <= m; j++) {
//                if ((m - j) + (2 * j) == n) {
//                    sb.append(m - j).append(" ").append(j).append("\n");
//                    break;
//                }
//            }
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

public class A11006 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int tc = Integer.parseInt(br.readLine());
        for (int i = 0; i < tc; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int u = (m * 2) - n;
            int t = m - u;
            sb.append(u).append(" ").append(t).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}