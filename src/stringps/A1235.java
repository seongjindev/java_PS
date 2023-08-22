package stringps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

//public class A1235 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        String[] arr = new String[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = br.readLine();
//        }
//        int rst = 0;
//        int len = arr[0].length();
//        for (int i = 0; i < len; i++) {
//            HashSet<String> hs = new HashSet<>();
//            boolean chk = true;
//            for (int j = 0; j < n; j++) {
//                hs.add(arr[j].substring(len - i - 1, len));
//                if (hs.size() != j + 1) {
//                    chk = false;
//                    break;
//                }
//            }
//            if (chk) {
//                rst = i + 1;
//                break;
//            }
//        }
//        System.out.println(rst);
//        br.close();
//    }
//}

//public class A1235 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        String[] arr = new String[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = br.readLine();
//        }
//        int rst = 0;
//        int len = arr[0].length();
//        for (int i = 0; i < len; i++) {
//            HashSet<String> hs = new HashSet<>();
//            boolean chk = false;
//            for (int j = 0; j < n; j++) {
//                hs.add(arr[j].substring(len - i - 1, len));
//                if (hs.size() == n) {
//                    chk = true;
//                    break;
//                }
//            }
//            if (chk) {
//                rst = i + 1;
//                break;
//            }
//        }
//        System.out.println(rst);
//        br.close();
//    }
//}

//public class A1235 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        String[] arr = new String[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = br.readLine();
//        }
//        int rst = 0;
//        int len = arr[0].length();
//        for (int i = 1; i <= len; i++) {
//            HashSet<String> hs = new HashSet<>();
//            boolean chk = false;
//            for (String j : arr) {
//                hs.add(j.substring(len - i, len));
//                if (hs.size() == n) {
//                    chk = true;
//                    break;
//                }
//            }
//            if (chk) {
//                rst = i;
//                break;
//            }
//        }
//        System.out.println(rst);
//        br.close();
//    }
//}

public class A1235 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }
        int rst = 0;
        int len = arr[0].length();
        for (int i = 1; i <= len; i++) {
            HashSet<String> hs = new HashSet<>();
            boolean chk = true;
            for (int j = 0; j < n; j++) {
                hs.add(arr[j].substring(len - i, len));
                if (hs.size() != j + 1) {
                    chk = false;
                    break;
                }
            }
            if (chk) {
                rst = i;
                break;
            }
        }
        System.out.println(rst);
        br.close();
    }
}
