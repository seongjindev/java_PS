package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//public class A6131 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int rst = 0;
//        for (int i = 1; i <= 500; i++) {
//            if (Math.pow(i, 2) + n == Math.pow((int) Math.sqrt(Math.pow(i, 2) + n), 2)) {
//                rst++;
//            }
//        }
//        System.out.println(rst);
//        br.close();
//    }
//}

//public class A6131 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int rst = 0;
//        for (int i = 1; i <= 500; i++) {
//            if (Math.sqrt(Math.pow(i, 2) + n) % 1 == 0) {
//                rst++;
//            }
//        }
//        System.out.println(rst);
//        br.close();
//    }
//}

//public class A6131 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int rst = 0;
//        for (int i = 1; i <= 500; i++) {
//            for (int j = i; j <= 500; j++) {
//                if (i * i + n == j * j){
//                    rst++;
//                }
//            }
//        }
//        System.out.println(rst);
//        br.close();
//    }
//}

//public class A6131 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int rst = 0;
//        for (int i = 1; i <= 500; i++) {
//            if (Math.sqrt(i * i + n) % 1 == 0) {
//                rst++;
//            }
//        }
//        System.out.println(rst);
//        br.close();
//    }
//}

public class A6131 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int rst = 0;
        for (int i = 1; i <= 500; i++) {
            for (int j = i; j <= 500; j++) {
                if (j * j - i * i == n){
                    rst++;
                }
            }
        }
        System.out.println(rst);
        br.close();
    }
}