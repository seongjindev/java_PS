package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//public class A1550 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String st = br.readLine();
//        int rst = 0;
//        for (int i = 0; i < st.length(); i++) {
//            char num = st.charAt(i);
//            int n;
//            if (num > 64) {
//                n = num - 55;
//            } else {
//                n = num - 48;
//            }
//            int stx = 1;
//            for (int j = 1; j < st.length() - i; j++) {
//                stx *= 16;
//            }
//            rst += stx * n;
//        }
//        System.out.println(rst);
//        br.close();
//    }
//}

//public class A1550 {
//    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt(16);
//        System.out.println(n);
//        sc.close();
//    }
//}

//public class A1550 {
//    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//        System.out.println(sc.nextInt(16));
//        sc.close();
//    }
//}

public class A1550 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(Integer.parseInt(br.readLine(), 16));
        br.close();
    }
}