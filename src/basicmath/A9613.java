package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

//public class A9613 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int t = Integer.parseInt(br.readLine());
//        for (int i = 0; i < t; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            int n = Integer.parseInt(st.nextToken());
//            int[] box = new int[n];
//            long sum = 0;
//            for (int j = 0; j < n; j++) {
//                box[j] = Integer.parseInt(st.nextToken());
//            }
//            for (int a = 0; a < n - 1; a++) {
//                for (int b = a + 1; b < n; b++) {
//                    sum += gcd(box[a], box[b]);
//                }
//            }
//            System.out.println(sum);
//        }
//        br.close();
//    }
//    public static int gcd(int a, int b) {
//        if (b == 0) {
//            return a;
//        }
//        return gcd(b, a % b);
//    }
//}

//public class A9613 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        for (int i = 0; i < t; i++) {
//            int n = sc.nextInt();
//            int[] arr = new int[n];
//            long sum = 0;
//            for (int j = 0; j < n; j++) {
//                arr[j] = sc.nextInt();
//            }
//            for (int a = 0; a < n - 1; a++) {
//                for (int b = a + 1; b < n; b++) {
//                    sum += gcd(arr[a], arr[b]);
//                }
//            }
//            System.out.println(sum);
//        }
//        sc.close();
//    }
//    public static int gcd(int a, int b) {
//        if (b == 0) {
//            return a;
//        }
//        return gcd(b, a % b);
//    }
//}

public class A9613 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            long sum = 0;
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            for (int a = 0; a < n - 1; a++) {
                for (int b = a + 1; b < n; b++) {
                    sum += gcd(arr[a], arr[b]);
                }
            }
            System.out.println(sum);
        }
        sc.close();
    }
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}