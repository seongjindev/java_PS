package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//public class A2747 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int[] fi = new int[n + 1];
//        fi[0] = 0;
//        fi[1] = 1;
//        for (int i = 2; i <= n; i++) {
//            fi[i] = fi[i - 1] + fi[i - 2];
//        }
//        System.out.println(fi[n]);
//        br.close();
//    }
//}

//public class A2747 {
//    static int[] arr;
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        arr = new int[n + 1];
//        System.out.println(fib(n));
//        br.close();
//    }
//    public static int fib(int n) {
//        if (n == 1 || n == 2) {
//            return 1;
//        }
//        if (arr[n] != 0) {
//            return arr[n];
//        }
//        return arr[n] = fib(n - 1) + fib(n - 2);
//    }
//}

public class A2747 {
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n + 1];
        System.out.println(fib(n));
        br.close();
    }
    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        if (arr[n] != 0) {
            return arr[n];
        }
        return arr[n] = fib(n - 1) + fib(n - 2);
    }
}