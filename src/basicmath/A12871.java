package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//public class A12871 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String s = br.readLine();
//        String t = br.readLine();
//        StringBuilder sb1 = new StringBuilder();
//        StringBuilder sb2 = new StringBuilder();
//        int sn = s.length();
//        int tn = t.length();
//        int lcm = (sn * tn) / gcd(sn, tn);
//        sn = lcm / sn;
//        tn = lcm / tn;
//        sb1.append(s.repeat(sn));
//        sb2.append(t.repeat(tn));
//        if (sb1.toString().equals(sb2.toString())) {
//            System.out.println(1);
//        } else {
//            System.out.println(0);
//        }
//        br.close();
//    }
//    public static int gcd(int a, int b) {
//        if (b == 0) {
//            return a;
//        }
//        return gcd(b, a % b);
//    }
//}

public class A12871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String t = br.readLine();
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb1.append(s.repeat(t.length()));
        sb2.append(t.repeat(s.length()));
        if (sb1.toString().equals(sb2.toString())) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        br.close();
    }
}