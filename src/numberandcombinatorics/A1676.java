package numberandcombinatorics;

//import java.util.Scanner;
//
//public class A1676 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int five = 5;
//        int rst = 0;
//        while(five<=n) {
//            rst += n/five;
//            five = five*5;
//        }
//        System.out.println(rst);
//        sc.close();
//    }
//}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A1676 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int five = 5;
        int rst = 0;
        while(five<=n) {
            rst += n/five;
            five = five*5;
        }
        System.out.println(rst);
        br.close();
    }
}
