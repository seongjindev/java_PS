package stringps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//public class A14405 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String[] pkc = {"pi", "ka", "chu"};
//        String input = br.readLine();
//        while (true) {
//            boolean ck = true;
//            for (int i = 0; i < 3; i++) {
//                if (input.indexOf(pkc[i]) == 0) {
//                    input = input.substring(pkc[i].length());
//                    ck = false;
//                }
//            }
//            if (ck) {
//                break;
//            }
//        }
//        if (input.length() == 0) {
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }
//        br.close();
//    }
//}

//public class A14405 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String input = br.readLine();
//        input = input.replaceAll("pi|ka|chu", "");
//        String rst = input.length() == 0 ? "YES" : "NO";
//        System.out.println(rst);
//        br.close();
//    }
//}

public class A14405 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        boolean matches = input.matches("(pi|ka|chu)*");
        String rst = matches ? "YES" : "NO";
        System.out.println(rst);
        br.close();
    }
}