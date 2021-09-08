package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A18238 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String in = br.readLine();
        int sum = 0;
        int fir = 0;
        for (int i = 0; i < in.length(); i++) {
            int n = (in.charAt(i) - 'A');
            int i1 = Math.abs(fir - n);
            sum += Math.min(i1, 26-i1);
            fir = in.charAt(i) - 'A';
        }
        System.out.println(sum);
        br.close();
    }
}
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class A18238 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String in = br.readLine();
//        int fir = 0;
//        int sum = 0;
//        for (int i = 0; i < in.length(); i++) {
//            int c = in.charAt(i) - 'A';
//            int n = Math.abs(c - fir);
//            sum += Math.min(n, 26 - n);
//            fir = c;
//        }
//        System.out.println(sum);
//        br.close();
//    }
//}