package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//public class A10539 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int[] num = new int[n];
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        for (int i = 0; i < n; i++) {
//            num[i] = Integer.parseInt(st.nextToken());
//        }
//        int[] rst = new int[n];
//        rst[0] = num[0];
//        for (int i = 1; i < n; i++) {
//            rst[i] = num[i] * (i + 1);
//            for (int j = 0; j < i; j++) {
//                rst[i] -= rst[j];
//            }
//        }
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < n; i++) {
//            sb.append(rst[i]).append(" ");
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

//public class A10539 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int[] num = new int[n];
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        for (int i = 0; i < n; i++) {
//            num[i] = Integer.parseInt(st.nextToken());
//        }
//        int[] rst = new int[n];
//        for (int i = 0; i < n; i++) {
//            rst[i] = num[i] * (i + 1);
//            for (int j = 0; j < i; j++) {
//                rst[i] -= rst[j];
//            }
//        }
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < n; i++) {
//            sb.append(rst[i]).append(" ");
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

public class A10539 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] num = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }
        int[] rst = new int[n];
        for (int i = 0; i < n; i++) {
            rst[i] = num[i] * (i + 1);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(rst[0]).append(" ");
        for (int i = 1; i < n; i++) {
            sb.append(rst[i] - rst[i - 1]).append(" ");
        }
        System.out.println(sb);
        br.close();
    }
}