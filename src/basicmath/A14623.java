package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

//public class A14623 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BigInteger b1 = new BigInteger(br.readLine(), 2);
//        BigInteger b2 = new BigInteger(br.readLine(), 2);
//        System.out.println(b1.multiply(b2).toString(2));
//        br.close();
//    }
//}

//public class A14623 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        long b1 = Long.parseLong(br.readLine(), 2);
//        long b2 = Long.parseLong(br.readLine(), 2);
//        long l = b1 * b2;
//        System.out.println(Long.toString(l, 2));
////        System.out.println(Long.toBinaryString(l));
//        br.close();
//    }
//}

public class A14623 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long b1 = Long.parseLong(br.readLine(), 2);
        long b2 = Long.parseLong(br.readLine(), 2);
        long l = b1 * b2;
//        System.out.println(Long.toString(l, 2));
        System.out.println(Long.toBinaryString(l));
        br.close();
    }
}