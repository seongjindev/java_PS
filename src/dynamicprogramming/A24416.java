package dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//public class A24416 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int[] f = new int[n + 1];
//        int fib = fib(n);
//        int fibonacci = fibonacci(f, n);
//        System.out.println(fib + " " + fibonacci);
//        br.close();
//    }
//    static int fib(int n) {
//        if (n == 1 || n == 2) {
//            return 1;
//        }
//        return fib(n - 1) + fib(n - 2);
//    }
//    static int fibonacci(int[] f, int n) {
//        int cnt = 0;
//        f[1] = 1;
//        f[2] = 1;
//        for (int i = 3; i <= n; i++) {
//            f[i] = f[i - 1] + f[i - 2];
//            cnt++;
//        }
//        return cnt;
//    }
//}

public class A24416 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int fib = fib(n);
        System.out.println(fib + " " + (n - 2));
        br.close();
    }
    static int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
