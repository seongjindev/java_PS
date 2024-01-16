package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

//public class A2935 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String a = br.readLine();
//        String op = br.readLine();
//        String b = br.readLine();
//        if (op.equals("*")) {
//            int l = a.length() + b.length();
//            System.out.println("1" + "0".repeat(l - 2));
//        } else {
//            String l, s;
//            int min;
//            if (a.length() > b.length()) {
//                min = b.length();
//                s = b;
//                l = a;
//                System.out.println(l.substring(0, l.length() - min) + s);
//            } else if (a.length() < b.length()){
//                min = a.length();
//                s = a;
//                l = b;
//                System.out.println(l.substring(0, l.length() - min) + s);
//            } else {
//                System.out.println("2" + "0".repeat(a.length() - 1));
//            }
//        }
//        br.close();
//    }
//}

//public class A2935 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String a = br.readLine();
//        String op = br.readLine();
//        String b = br.readLine();
//        if (op.equals("*")) {
//            int l = a.length() + b.length();
//            System.out.println("1" + "0".repeat(l - 2));
//        } else {
//            String l, s;
//            int min;
//            if (a.length() != b.length()) {
//                min = Math.min(a.length(), b.length());
//                s = a.length() < b.length() ? a : b;
//                l = a.length() < b.length() ? b : a;
//                System.out.println(l.substring(0, l.length() - min) + s);
//            } else {
//                System.out.println("2" + "0".repeat(a.length() - 1));
//            }
//        }
//        br.close();
//    }
//}

public class A2935 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger a = new BigInteger(br.readLine());
        String op = br.readLine();
        BigInteger b = new BigInteger(br.readLine());
        if (op.equals("+")) {
            System.out.println(a.add(b));
        } else {
            System.out.println(a.multiply(b));
        }
        br.close();
    }
}