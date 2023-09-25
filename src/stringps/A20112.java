package stringps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//public class A20112 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        String[] sa = new String[n];
//        for (int i = 0; i < n; i++) {
//            sa[i] = br.readLine();
//        }
//        String rst = "YES";
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (sa[i].charAt(j) != sa[j].charAt(i)) {
//                    rst = "NO";
//                    break;
//                }
//            }
//            if (rst.equals("NO")) {
//                break;
//            }
//        }
//        System.out.println(rst);
//        br.close();
//    }
//}

public class A20112 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] sa = new String[n];
        for (int i = 0; i < n; i++) {
            sa[i] = br.readLine();
        }
        String rst = "YES";
        loop:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (sa[i].charAt(j) != sa[j].charAt(i)) {
                    rst = "NO";
                    break loop;
                }
            }
        }
        System.out.println(rst);
        br.close();
    }
}