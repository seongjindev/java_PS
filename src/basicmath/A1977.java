package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//public class A1977 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int m = Integer.parseInt(br.readLine());
//        int n = Integer.parseInt(br.readLine());
//        int min = 0;
//        int sum = 0;
//        for (int i = 1; i < 101; i++) {
//            if (i * i >= m && i * i <= n) {
//                if (min == 0) {
//                    min = i * i;
//                }
//                sum += i * i;
//            }
//            if (i * i > n) {
//                break;
//            }
//        }
//        if (sum == 0) {
//            System.out.println(-1);
//        } else {
//            System.out.println(sum + "\n" + min);
//        }
//        br.close();
//    }
//}

public class A1977 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int min = 0;
        int sum = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (i * i >= m && i * i <= n) {
                if (min == 0) {
                    min = i * i;
                }
                sum += i * i;
            }
        }
        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum + "\n" + min);
        }
        br.close();
    }
}
