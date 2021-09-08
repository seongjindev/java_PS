package greedy;

//import java.util.Scanner;
//
//public class A10162 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int time = sc.nextInt();
//        int a = 300;
//        int b = 60;
//        int c = 10;
//        int at = 0;
//        int bt = 0;
//        int ct = 0;
//        if (time >= a) {
//            at = time / a;
//            time = time % a;
//        }
//        if (time >= b) {
//            bt = time/b;
//            time = time%b;
//        }
//        if (time >= c) {
//            ct = time/c;
//            time = time%c;
//        }
//        if(time != 0) {
//            System.out.println(-1);
//        }else {
//            System.out.println(at + " " + bt + " " + ct);
//        }
//        sc.close();
//    }
//}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A10162 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int time = Integer.parseInt(br.readLine());
        int[] tb = {300, 60, 10};
        int cnt = 0;
        for (int i = 0; i < 3; i++) {
            cnt = 0;
            if (tb[i] <= time) {
                cnt = time/tb[i];
                time = time%tb[i];
            }
            sb.append(cnt + " ");
        }
        if(time != 0) {
            System.out.println(-1);
        }else {
            System.out.println(sb);
        }
        br.close();
    }
}