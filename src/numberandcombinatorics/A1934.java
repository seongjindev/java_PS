package numberandcombinatorics;

import java.util.Arrays;
import java.util.Scanner;

//public class A1934 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        StringBuilder sb = new StringBuilder();
//        int cnt = sc.nextInt();
//        boolean[] pri = new boolean[45001];
//        Arrays.fill(pri, true);
//        for(int i=2; i<=Math.sqrt(45001); i++){
//            if(pri[i]){
//                for(int j=i+i; j<45001; j=j+i){
//                    pri[j] = false;
//                }
//            }
//        }
//        for(int i=0; i<cnt; i++){
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//            int c = 1;
//            if(a<b){
//                int d = a;
//                a = b;
//                b = d;
//            }
//            for(int j=2; j<=a; j++){
//                if(pri[j]){
//                    while(true) {
//                        if(a%j==0 && b%j==0) {
//                            a = a/j;
//                            b = b/j;
//                            c *=j;
//                        }else {
//                            break;
//                        }
//                    }
//                }
//            }
//            sb.append(a*b*c + "\n");
//        }
//        System.out.println(sb);
//        sc.close();
//    }
//}


public class A1934 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int cnt = sc.nextInt();
        for(int i=0; i<cnt; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = gcd(a,b);
            sb.append((a*b)/c + "\n");
        }
        System.out.println(sb);
        sc.close();
    }
    static int gcd(int a, int b) {
        if(b == 0) {
            return a;
        }else {
            return gcd(b, a%b);
        }
    }
}
