package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//public class A3036 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int first = Integer.parseInt(st.nextToken());
//        for (int i = 0; i < n - 1; i++) {
//            int ring = Integer.parseInt(st.nextToken());
//            int a = first;
//            int b = ring;
//            while (true) {
//                int mod = a % b;
//                if (mod == 0) {
//                    break;
//                }
//                a = b;
//                b = mod;
//            }
//            System.out.println((first/b) + "/" + (ring/b));
//        }
//        br.close();
//    }
//}

public class A3036 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int first = Integer.parseInt(st.nextToken());
        for (int i = 0; i < n - 1; i++) {
            int ring = Integer.parseInt(st.nextToken());
            int gcd = gcd(first, ring);
            System.out.println((first/gcd) + "/" + (ring/gcd));
        }
        br.close();
    }
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
