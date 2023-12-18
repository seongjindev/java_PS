package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//public class A14723 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int o = 0;
//        int cnt = 1;
//        while (o != n) {
//            for (int i = cnt; i > 0; i--) {
//                o++;
//                if (o == n) {
//                    System.out.println(i + " " + (cnt - i + 1));
//                    break;
//                }
//            }
//            cnt++;
//        }
//        br.close();
//    }
//}

//public class A14723 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int cnt = 0;
//        int o = 0;
//        int a;
//        int b;
//        int num = 1;
//        while (true) {
//            o += num;
//            cnt++;
//            num++;
//            if (o >= n) {
//                a = (o - n) + 1;
//                b = cnt - (o - n);
//                break;
//            }
//        }
//        System.out.println(a + " " + b);
//        br.close();
//    }
//}

public class A14723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        int o = 0;
        int num = 1;
        while (true) {
            o += num;
            cnt++;
            num++;
            if (o >= n) {
                System.out.println(((o - n) + 1) + " " + (cnt - (o - n)));
                break;
            }
        }
        br.close();
    }
}