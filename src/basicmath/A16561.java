package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//public class A16561 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int rst = 0;
//        for (int i = 3; i <= n; i += 3) {
//            for (int j = 3; j <= n; j += 3) {
//                for (int k = 3; k <= n; k += 3) {
//                    if (i + j + k == n) {
//                        rst++;
//                        break;
//                    }
//                }
//                if (i + j >= n) break;
//            }
//            if (i >= n) break;
//        }
//        System.out.println(rst);
//        br.close();
//    }
//}

//public class A16561 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int rst = 0;
//        for (int i = 3; i <= n; i += 3) {
//            for (int j = 3; j <= n; j += 3) {
//                if ((n - i - j) > 0 && (n - i - j) % 3 == 0) {
//                    rst++;
//                }
//                if (i + j >= n) break;
//            }
//            if (i >= n) break;
//        }
//        System.out.println(rst);
//        br.close();
//    }
//}

//public class A16561 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int rst = 0;
//        for (int i = 3; i <= n; i += 3) {
//            for (int j = 3; j <= n; j += 3) {
//                if ((n - i - j) > 0 && (n - i - j) % 3 == 0) {
//                    rst++;
//                }
//                if (i + j >= n) break;
//            }
//        }
//        System.out.println(rst);
//        br.close();
//    }
//}

public class A16561 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int rst = 0;
        for (int i = 3; i <= n; i += 3) {
            for (int j = 3; j <= n; j += 3) {
                int num = n - i - j;
                if (num > 0 && num % 3 == 0) {
                    rst++;
                }
                if (i + j >= n) break;
            }
        }
        System.out.println(rst);
        br.close();
    }
}