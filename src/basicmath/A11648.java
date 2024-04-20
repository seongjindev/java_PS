package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//public class A11648 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int rst = 0;
//        while (n >= 10) {
//            int mul = 1;
//            while (n > 0) {
//                int mod = n % 10;
//                mul *= mod;
//                n /= 10;
//            }
//            n = mul;
//            rst++;
//        }
//        System.out.println(rst);
//        br.close();
//    }
//}

public class A11648 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int rst = 0;
        while (n >= 10) {
            int mul = 1;
            while (n > 0) {
                mul *= n % 10;
                n /= 10;
            }
            n = mul;
            rst++;
        }
        System.out.println(rst);
        br.close();
    }
}