package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

//public class A19946 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String n = br.readLine();
//        int rst = 0;
//        for (int i = 1; i <= 64; i++) {
//            BigInteger t = BigInteger.valueOf(1);
//            for (int j = 1; j <= 64; j++) {
//                t = t.add(t);
//                if (i == j) {
//                    t = t.subtract(BigInteger.valueOf(1));
//                }
//            }
//            if (t.toString().equals(n)) {
//                rst = i;
//                break;
//            }
//        }
//        System.out.println(rst);
//        br.close();
//    }
//}

//public class A19946 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String n = br.readLine();
//        int rst = 0;
//        for (int i = 1; i <= 64; i++) {
//            BigInteger t = BigInteger.ONE;
//            for (int j = 1; j <= 64; j++) {
//                t = t.add(t);
//                if (i == j) {
//                    t = t.subtract(BigInteger.ONE);
//                }
//            }
//            if (t.toString().equals(n)) {
//                rst = i;
//                break;
//            }
//        }
//        System.out.println(rst);
//        br.close();
//    }
//}

//public class A19946 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BigInteger n = new BigInteger(br.readLine());
//        int rst = 0;
//        for (int i = 64; i >= 1; i--) {
//            if (!n.remainder(BigInteger.TWO).equals(BigInteger.ZERO)) {
//                rst = i;
//                break;
//            }
//            n = n.divide(BigInteger.TWO);
//        }
//        System.out.println(rst);
//        br.close();
//    }
//}

public class A19946 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger n = new BigInteger(br.readLine());
        for (int i = 64; i >= 1; i--) {
            if (!n.remainder(BigInteger.TWO).equals(BigInteger.ZERO)) {
                System.out.println(i);
                break;
            }
            n = n.divide(BigInteger.TWO);
        }
        br.close();
    }
}