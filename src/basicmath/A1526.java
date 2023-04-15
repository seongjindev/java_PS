package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//public class A1526 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String in = br.readLine();
//        while (true) {
//            boolean chk = true;
//            for (int i = 0; i < in.length(); i++) {
//                if (in.charAt(i) != '7' && in.charAt(i) != '4') {
//                    chk = false;
//                }
//            }
//            if (chk) {
//                break;
//            }
//            in = String.valueOf(Integer.parseInt(in)-1);
//        }
//        System.out.println(in);
//        br.close();
//    }
//}

public class A1526 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int in = Integer.parseInt(br.readLine());
        for (int i = in; i >= 4; i--) {
            boolean chk = true;
            int num = i;
            while (num != 0) {
                if (num % 10 == 4 || num % 10 == 7) {
                    num /= 10;
                } else {
                    chk = false;
                    break;
                }
            }
            if (chk) {
                System.out.println(i);
                break;
            }
        }
        br.close();
    }
}