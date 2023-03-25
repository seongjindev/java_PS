package bruteforce;

import java.util.ArrayList;
import java.util.Scanner;

//public class A9506 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        ArrayList<Integer> arr;
//        int total;
//        while (true) {
//            int n = sc.nextInt();
//            if (n == -1) {
//                break;
//            }
//            arr = new ArrayList<>();
//            total = 0;
//            for (int i = 1; i < n; i++) {
//                if (n % i == 0) {
//                    total += i;
//                    arr.add(i);
//                }
//            }
//            if (total == n) {
//                String rst = n + " = ";
//                for (int i = 0; i < arr.size(); i++) {
//                    if (i == arr.size()-1) {
//                        rst += arr.get(i);
//                    } else {
//                        rst += arr.get(i) + " + ";
//                    }
//                }
//                System.out.println(rst);
//            } else {
//                System.out.println(n + " is NOT perfect.");
//            }
//        }
//        sc.close();
//    }
//}

public class A9506 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int total;
        while (true) {
            int n = sc.nextInt();
            if (n == -1) {
                break;
            }
            total = 1;
            sb.append(n + " = 1");
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    total += i;
                    sb.append(" + " + i);
                }
            }
            if (total == n) {
                System.out.println(sb);
            } else {
                System.out.println(n + " is NOT perfect.");
            }
            sb = new StringBuilder();
        }
        sc.close();
    }
}
