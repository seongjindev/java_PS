package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//public class A3004 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int rst;
//        int h = n / 2;
//        if (n % 2 == 0) {
//            rst = (h + 1) * (h + 1);
//        } else {
//            rst = (h + 1) * (h + 2);
//        }
//        System.out.println(rst);
//        br.close();
//    }
//}

public class A3004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int h = n / 2;
        int rst = h + 1;
        if (n % 2 == 0) {
            rst *= (h + 1);
        } else {
            rst *= (h + 2);
        }
        System.out.println(rst);
        br.close();
    }
}