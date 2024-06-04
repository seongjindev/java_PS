package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//public class A11134 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int t = Integer.parseInt(br.readLine());
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < t; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            int n = Integer.parseInt(st.nextToken());
//            int c = Integer.parseInt(st.nextToken());
//            int rst = n / c;
//            if (n % c > 0) {
//                rst += 1;
//            }
//            sb.append(rst).append("\n");
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

//public class A11134 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int t = Integer.parseInt(br.readLine());
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < t; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            int n = Integer.parseInt(st.nextToken());
//            int c = Integer.parseInt(st.nextToken());
//            sb.append((int) Math.ceil((double) n / c)).append("\n");
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

public class A11134 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            sb.append((n + (c - 1)) / c).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}
