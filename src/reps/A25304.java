package reps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

//public class A25304 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int total = Integer.parseInt(br.readLine());
//        int cnt = Integer.parseInt(br.readLine());
//        int price = 0;
//        StringTokenizer st;
//        for (int i = 0; i < cnt; i++) {
//            st = new StringTokenizer(br.readLine());
//            price += Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
//        }
//        if (total == price) {
//            System.out.println("Yes");
//        } else {
//            System.out.println("No");
//        }
//        br.close();
//    }
//}

public class A25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int cnt = sc.nextInt();
        int price = 0;
        for (int i = 0; i < cnt; i++) {
            price += sc.nextInt() * sc.nextInt();
        }
        if (total == price) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}