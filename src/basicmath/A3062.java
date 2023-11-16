package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//public class A3062 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int t = Integer.parseInt(br.readLine());
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < t; i++) {
//            int n = Integer.parseInt(br.readLine());
//            int rev = Integer.parseInt(new StringBuilder(String.valueOf(n)).reverse().toString());
//            String s = String.valueOf(n + rev);
//            String rst = "YES";
//            for (int j = 0; j < s.length() / 2; j++) {
//                if (s.charAt(j) != s.charAt(s.length() - 1 - j)) {
//                    rst = "NO";
//                    break;
//                }
//            }
//            sb.append(rst).append("\n");
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

//public class A3062 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int t = Integer.parseInt(br.readLine());
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < t; i++) {
//            int n = Integer.parseInt(br.readLine());
//            int rev = Integer.parseInt(new StringBuilder(String.valueOf(n)).reverse().toString());
//            String s = String.valueOf(n + rev);
//            String rst = "YES";
//            if (!s.equals(new StringBuilder(s).reverse().toString())) {
//                rst = "NO";
//            }
//            sb.append(rst).append("\n");
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

public class A3062 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int rev = Integer.parseInt(new StringBuilder(String.valueOf(n)).reverse().toString());
            String s = String.valueOf(n + rev);
            if (s.equals(new StringBuilder(s).reverse().toString())) {
                sb.append("YES");
            } else {
                sb.append("NO");
            }
            sb.append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}
