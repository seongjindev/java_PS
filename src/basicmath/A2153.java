package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//public class A2153 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String s = br.readLine();
//        int sum = 0;
//        for (int i = 0; i < s.length(); i++) {
//            char ch = s.charAt(i);
//            int num;
//            if (ch < 96) {
//                num = ch - 64 + 26;
//            } else {
//                num = ch - 96;
//            }
//            sum += num;
//        }
//        int cnt = 0;
//        for (int i = 1; i <= sum; i++) {
//            if (sum % i == 0) cnt++;
//            if (cnt > 2) break;
//        }
//        if (cnt == 2 || cnt == 1) {
//            System.out.println("It is a prime word.");
//        } else {
//            System.out.println("It is not a prime word.");
//        }
//        br.close();
//    }
//}

public class A2153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int num;
            if (ch < 96) {
                num = ch - 64 + 26;
            } else {
                num = ch - 96;
            }
            sum += num;
        }
        boolean ck = true;
        for (int i = 2; i < sum; i++) {
            if (sum % i == 0) {
                ck = false;
                break;
            }
        }
        if (ck) {
            System.out.println("It is a prime word.");
        } else {
            System.out.println("It is not a prime word.");
        }
        br.close();
    }
}