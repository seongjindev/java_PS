package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//public class A5618 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int[] num = new int[n];
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int max = 0;
//        for (int i = 0; i < n; i++) {
//            num[i] = Integer.parseInt(st.nextToken());
//            max = Math.max(max, num[i]);
//        }
//        StringBuilder sb = new StringBuilder();
//        for (int i = 1; i <= max; i++) {
//            boolean ck = true;
//            for (int j = 0; j < n; j++) {
//                if (num[j] % i != 0) {
//                    ck = false;
//                    break;
//                }
//            }
//            if (ck) {
//                sb.append(i).append("\n");
//            }
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

//public class A5618 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int[] num = new int[n];
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int min = 100000001;
//        for (int i = 0; i < n; i++) {
//            num[i] = Integer.parseInt(st.nextToken());
//            min = Math.min(min, num[i]);
//        }
//        StringBuilder sb = new StringBuilder();
//        for (int i = 1; i <= min; i++) {
//            boolean ck = true;
//            for (int j = 0; j < n; j++) {
//                if (num[j] % i != 0) {
//                    ck = false;
//                    break;
//                }
//            }
//            if (ck) {
//                sb.append(i).append("\n");
//            }
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

public class A5618 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] num = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int g = Integer.parseInt(st.nextToken());
        num[0] = g;
        for (int i = 1; i < n; i++) {
            num[i] = Integer.parseInt(st.nextToken());
            g = gcd(g, num[i]);

        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= g; i++) {
            boolean ck = true;
            for (int j = 0; j < n; j++) {
                if (num[j] % i != 0) {
                    ck = false;
                    break;
                }
            }
            if (ck) {
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb);
        br.close();
    }
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}