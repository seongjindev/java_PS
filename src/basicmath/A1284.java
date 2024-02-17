package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//public class A1284 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        String in;
//        while (!(in = br.readLine()).equals("0")) {
//            int sum = 1;
//            for (int i = 0; i < in.length(); i++) {
//                if (in.charAt(i) == '1') {
//                    sum += 2;
//                } else if (in.charAt(i) == '0') {
//                    sum += 4;
//                } else {
//                    sum += 3;
//                }
//                sum++;
//            }
//            sb.append(sum).append("\n");
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

//public class A1284 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        String in;
//        while (!(in = br.readLine()).equals("0")) {
//            int sum = 1;
//            for (int i = 0; i < in.length(); i++) {
//                if (in.charAt(i) == '1') {
//                    sum += 3;
//                } else if (in.charAt(i) == '0') {
//                    sum += 5;
//                } else {
//                    sum += 4;
//                }
//            }
//            sb.append(sum).append("\n");
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

public class A1284 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String in;
        while (!(in = br.readLine()).equals("0")) {
            int sum = 1;
            for (int i = 0; i < in.length(); i++) {
                sum += 3;
                if (in.charAt(i) == '0') {
                    sum += 2;
                } else if (in.charAt(i) != '1') {
                    sum += 1;
                }
            }
            sb.append(sum).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}