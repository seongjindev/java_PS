package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//public class A1834 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        long n = Long.parseLong(br.readLine());
//        long rst = 0;
//        long num = n + 1;
//        while (true) {
//            if (num % n == num / n) {
//                rst += num;
//                num = num + n + 1;
//            }
//            if (num / n >= n) {
//                break;
//            }
//        }
//        System.out.println(rst);
//        br.close();
//    }
//}

public class A1834 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long rst = 0;
        for (int i = 0; i < n; i++) {
            rst += (n + 1) * i;
        }
        System.out.println(rst);
    }
}
