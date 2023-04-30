package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//public class A2875 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int m = Integer.parseInt(st.nextToken());
//        int k = Integer.parseInt(st.nextToken());
//        int max = 0;
//        for (int i = 0; i <= k; i++) {
//            if (n - i < 2) {
//                break;
//            }
//            for (int j = k - i; j <= k; j++) {
//                if (m - j < 2) {
//                    break;
//                }
//                max = Math.max(max, Math.min((n - i) / 2, (m - j)));
//            }
//        }
//        System.out.println(max);
//        br.close();
//    }
//}

//public class A2875 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int m = Integer.parseInt(st.nextToken());
//        int k = Integer.parseInt(st.nextToken());
//        int max = 0;
//        for (int i = 0; i <= k; i++) {
//            for (int j = k - i; j <= k; j++) {
//                max = Math.max(max, Math.min((n - i) / 2, (m - j)));
//            }
//        }
//        System.out.println(max);
//        br.close();
//    }
//}

public class A2875 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int max = 0;
        while (n >= 2 && m >= 1 && n+m >= k+3) {
            n -= 2;
            m--;
            max++;
        }
        System.out.println(max);
        br.close();
    }
}