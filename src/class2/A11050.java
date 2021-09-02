package class2;

//import java.util.Scanner;
//
//public class A11050 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int k = sc.nextInt();
//        int sumN = 1;
//        int sumK = 1;
//        for(int i = 1; i <= k ; i++){
//            sumN *= (n-i+1);
//            sumK *= i;
//        }
//        System.out.println(sumN/sumK);
//        sc.close();
//    }
//}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int sumN = 1;
        int sumK = 1;
        for(int i = 1; i <= k ; i++){
            sumN *= (n-i+1);
            sumK *= i;
        }
        System.out.println(sumN/sumK);
        br.close();
    }
}
