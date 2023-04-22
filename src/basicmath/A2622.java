package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//public class A2622 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int cnt = 0;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n - i; j++) {
//                if ((n - i - j) < i + j && (n - j) > j && (n - i) > i && (n - i - j) > 0 && (n - i - j) <= i && (n - i - j) <= j && i >= j) {
//                    cnt++;
//                }
//            }
//        }
//        System.out.println(cnt);
//    }
//}

//public class A2622 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int cnt = 0;
//        for (int i = 1; i <= n; i++) {
//            for (int j = i; j <= n - i - 1; j++) {
//                if ((i + j) > (n - i - j) && (n - i - j) >= j) {
//                    cnt++;
//                }
//            }
//        }
//        System.out.println(cnt);
//    }
//}

//public class A2622 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int cnt = 0;
//        for (int i = 1; i <= n/2; i++) {
//            for (int j = i; j <= n/2; j++) {
//                if ((i + j) > (n - i - j) && (n - i - j) >= j) {
//                    cnt++;
//                }
//            }
//        }
//        System.out.println(cnt);
//    }
//}

//public class A2622 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int cnt = 0;
//        for (int i = 1; i <= n/2; i++) {
//            for (int j = i; j <= n/2; j++) {
//                if (j > (n - i - j)) {
//                    break;
//                }
//                if ((i + j) > (n - i - j) && (n - i - j) >= j) {
//                    cnt++;
//                }
//            }
//        }
//        System.out.println(cnt);
//    }
//}

//public class A2622 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int cnt = 0;
//        for (int i = 1; i <= n/3; i++) {
//            for (int j = i; j <= n/2; j++) {
//                if (j > (n - i - j)) {
//                    break;
//                }
//                if ((i + j) > (n - i - j) && (n - i - j) >= j) {
//                    cnt++;
//                }
//            }
//        }
//        System.out.println(cnt);
//    }
//}

public class A2622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        for (int i = 1; i <= n/3; i++) {
            for (int j = i; j <= n/2; j++) {
                if (j > (n - i - j)) {
                    break;
                }
                if ((i + j) > (n - i - j)) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
