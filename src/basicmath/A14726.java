package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//public class A14726 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int t = Integer.parseInt(br.readLine());
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < t; i++) {
//            String s = br.readLine();
//            int sum = 0;
//            for (int j = 16; j > 0; j--) {
//                int num = Integer.parseInt(s.substring(j - 1, j));
//                if (j % 2 == 0) {
//                    sum += num;
//                } else {
//                    num *= 2;
//                    if (num >= 10) {
//                        while (num != 0) {
//                            sum += num % 10;
//                            num /= 10;
//                        }
//                    } else {
//                        sum += num;
//                    }
//                }
//            }
//            if (sum % 10 == 0){
//                sb.append("T");
//            } else {
//                sb.append("F");
//            }
//            sb.append("\n");
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

//public class A14726 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int t = Integer.parseInt(br.readLine());
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < t; i++) {
//            String[] sp = br.readLine().split("");
//            int sum = 0;
//            for (int j = 15; j >= 0; j--) {
//                int num = Integer.parseInt(sp[j]);
//                if (j % 2 == 0) {
//                    num *= 2;
//                    if (num >= 10) {
//                        while (num != 0) {
//                            sum += num % 10;
//                            num /= 10;
//                        }
//                    } else {
//                        sum += num;
//                    }
//                } else {
//                    sum += num;
//                }
//            }
//            if (sum % 10 == 0){
//                sb.append("T");
//            } else {
//                sb.append("F");
//            }
//            sb.append("\n");
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

public class A14726 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            String[] sp = br.readLine().split("");
            int sum = 0;
            String rst = "T";
            for (int j = 15; j >= 0; j--) {
                int num = Integer.parseInt(sp[j]);
                if (j % 2 == 0) {
                    num *= 2;
                    if (num >= 10) {
                        sum += num % 10 + num / 10;
                    } else {
                        sum += num;
                    }
                } else {
                    sum += num;
                }
            }
            if (sum % 10 != 0){
                rst = "F";
            }
            sb.append(rst).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}