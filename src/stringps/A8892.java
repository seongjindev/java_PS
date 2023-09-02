package stringps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//public class A8892 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int t = Integer.parseInt(br.readLine());
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < t; i++) {
//            int k = Integer.parseInt(br.readLine());
//            String[] arr = new String[k];
//            for (int j = 0; j < k; j++) {
//                arr[j] = br.readLine();
//            }
//            boolean find = false;
//            for (int a = 0; a < k; a++) {
//                for (int b = a + 1; b < k; b++) {
//                    String s1 = arr[a] + arr[b];
//                    if (ck(s1)) {
//                        sb.append(s1).append("\n");
//                        find = true;
//                        break;
//                    }
//                    String s2 = arr[b] + arr[a];
//                    if (ck(s2)) {
//                        sb.append(s2).append("\n");
//                        find = true;
//                        break;
//                    }
//                }
//                if (find) {
//                    break;
//                }
//            }
//            if (!find) {
//                sb.append("0").append("\n");
//            }
//        }
//        System.out.println(sb);
//        br.close();
//    }
//    public static boolean ck(String s) {
//        int st = 0;
//        int ed = s.length() - 1;
//        while (st <= ed) {
//            if (s.charAt(st) == s.charAt(ed)) {
//                st++;
//                ed--;
//            } else {
//                return false;
//            }
//        }
//        return true;
//    }
//}

public class A8892 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            int k = Integer.parseInt(br.readLine());
            String[] arr = new String[k];
            for (int j = 0; j < k; j++) {
                arr[j] = br.readLine();
            }
            boolean find = false;
            for (int a = 0; a < k; a++) {
                for (int b = 0; b < k; b++) {
                    if (a != b && ck(arr[a] + arr[b])) {
                        sb.append(arr[a]).append(arr[b]).append("\n");
                        find = true;
                        break;
                    }
                }
                if (find) {
                    break;
                }
            }
            if (!find) {
                sb.append("0").append("\n");
            }
        }
        System.out.println(sb);
        br.close();
    }
    public static boolean ck(String s) {
        int st = 0;
        int ed = s.length() - 1;
        while (st <= ed) {
            if (s.charAt(st) == s.charAt(ed)) {
                st++;
                ed--;
            } else {
                return false;
            }
        }
        return true;
    }
}
