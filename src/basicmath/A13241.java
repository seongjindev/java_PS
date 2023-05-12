package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//public class A13241 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        long a = Long.parseLong(st.nextToken());
//        long b = Long.parseLong(st.nextToken());
//        long min = Math.min(a, b);
//        long max = Math.max(a, b);
//        while (true) {
//            long l = max % min;
//            if (l == 0) {
//                break;
//            }
//            max = min;
//            min = l;
//        }
//        long rst = (a * b) / min;
//        System.out.println(rst);
//        br.close();
//    }
//}

//public class A13241 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        long a = Long.parseLong(st.nextToken());
//        long b = Long.parseLong(st.nextToken());
//        long ab = a * b;
//        while (true) {
//            long l = a % b;
//            if (l == 0) {
//                break;
//            }
//            a = b;
//            b = l;
//        }
//        System.out.println(ab / b);
//        br.close();
//    }
//}

public class A13241 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        System.out.println(a*b/gcd(a, b));
        br.close();
    }

    public static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
