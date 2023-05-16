package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//public class A1748 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int one = 1;
//        int ten = 10;
//        int rst = 0;
//        for (int i = 1; i <= n; i++) {
//            if (i % ten == 0) {
//                ten *= 10;
//                one++;
//            }
//            rst += one;
//        }
//        System.out.println(rst);
//        br.close();
//    }
//}

public class A1748 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String in = br.readLine();
        int n = Integer.parseInt(in);
        int rst = (n - (int)Math.pow(10, in.length() - 1) + 1) * in.length();
        for (int i = in.length() - 1; i > 0; i--) {
            rst += ((int)Math.pow(10, i - 1) * 9) * i;
        }
        System.out.println(rst);
        br.close();
    }
}
