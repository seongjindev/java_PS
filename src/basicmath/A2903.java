package basicmath;

import java.util.Scanner;

//public class A2903 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int point = 3;
//        int two = 2;
//        for (int i = 1; i < n; i++) {
//            point += two;
//            two *= 2;
//        }
//        System.out.println(point * point);
//        sc.close();
//    }
//}

public class A2903 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int point = 3;
        for (int i = 1; i < n; i++) {
            point = point * 2 - 1;
        }
        System.out.println(point * point);
        sc.close();
    }
}
