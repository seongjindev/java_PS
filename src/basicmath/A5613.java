package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//public class A5613 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int rst = Integer.parseInt(br.readLine());
//        while (true) {
//            String s = br.readLine();
//            if (s.equals("=")) {
//                break;
//            } else {
//                int num = Integer.parseInt(br.readLine());
//                if (s.equals("+")) {
//                    rst += num;
//                } else if (s.equals("-")) {
//                    rst -= num;
//                } else if (s.equals("*")) {
//                    rst *= num;
//                } else {
//                    rst /= num;
//                }
//            }
//        }
//        System.out.println(rst);
//        br.close();
//    }
//}

public class A5613 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int rst = Integer.parseInt(br.readLine());
        while (true) {
            String s = br.readLine();
            if (s.equals("=")) {
                break;
            }
            int num = Integer.parseInt(br.readLine());
            if (s.equals("+")) {
                rst += num;
            } else if (s.equals("-")) {
                rst -= num;
            } else if (s.equals("*")) {
                rst *= num;
            } else {
                rst /= num;
            }
        }
        System.out.println(rst);
        br.close();
    }
}