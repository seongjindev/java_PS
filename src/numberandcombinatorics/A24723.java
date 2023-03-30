package numberandcombinatorics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//public class A24723 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int rst = 2;
//        for (int i = 1; i < n; i++) {
//            rst *= 2;
//        }
//        System.out.println(rst);
//        br.close();
//    }
//}

public class A24723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println((int)Math.pow(2, n));
        br.close();
    }
}