package basicmath;

//import java.util.Scanner;
//
//public class A2839 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int rst = 0;
//        while(n>=0) {
//            if ((n%5)%3==0) {
//                rst += n/5 + (n%5)/3;
//                break;
//            }
//            n -= 3;
//            rst++;
//        }
//        if(n<=0) {
//            rst = -1;
//        }
//        System.out.println(rst);
//        sc.close();
//    }
//}

import java.util.Scanner;

public class A2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rst = -1;
        if(n==4 || n==7) {
        }else if(n%5==0) {
            rst = n/5;
        }else if((n-1)%5==0) {
            rst = (n-6)/5 + 2;
        }else if((n-2)%5==0) {
            rst = (n-12)/5 +4;
        }else if((n-3)%5==0) {
            rst = (n-3)/5 + 1;
        }else if((n-4)%5==0) {
            rst = (n-9)/5 + 3;
        }
        System.out.println(rst);
        sc.close();
    }
}
