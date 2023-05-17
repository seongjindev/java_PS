package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//public class A11502 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int t = Integer.parseInt(br.readLine());
//        boolean[] s = new boolean[1001];
//        for (int i = 2; i < 1001; i++) {
//            if (!s[i]) {
//                for (int j = 2; j < 1001; j++) {
//                    if (i*j >= 1001) {
//                        break;
//                    }
//                    s[i*j] = true;
//                }
//            }
//        }
//        boolean chk;
//        for (int i = 0; i < t; i++) {
//            int k = Integer.parseInt(br.readLine());
//            chk = true;
//            Loop1:
//            for (int a = 2; a < 1001; a++) {
//                for (int b = 2; b < 1001; b++) {
//                    if (s[a]) break;
//                    for (int c = 2; c < 1001; c++) {
//                        if (s[b]) break;
//                        if (!s[c] && a + b + c == k) {
//                            System.out.println(a + " " + b + " " + c);
//                            chk = false;
//                            break Loop1;
//                        }
//                    }
//                }
//            }
//            if (chk) {
//                System.out.println(0);
//            }
//        }
//        br.close();
//    }
//}

//public class A11502 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        int t = Integer.parseInt(br.readLine());
//        boolean[] s = new boolean[1001];
//        for (int i = 2; i < 1001; i++) {
//            if (!s[i]) {
//                for (int j = 2; j < 1001; j++) {
//                    if (i*j >= 1001) {
//                        break;
//                    }
//                    s[i*j] = true;
//                }
//            }
//        }
//        boolean chk;
//        for (int i = 0; i < t; i++) {
//            int k = Integer.parseInt(br.readLine());
//            chk = true;
//            Loop1:
//            for (int a = 2; a < 1001; a++) {
//                for (int b = 2; b < 1001; b++) {
//                    if (s[a]) break;
//                    for (int c = 2; c < 1001; c++) {
//                        if (s[b]) break;
//                        if (!s[c] && a + b + c == k) {
//                            sb.append(a).append(" ").append(b).append(" ").append(c).append("\n");
//                            chk = false;
//                            break Loop1;
//                        }
//                    }
//                }
//            }
//            if (chk) {
//                sb.append(0 + "\n");
//            }
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

//public class A11502 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        int t = Integer.parseInt(br.readLine());
//        boolean[] s = new boolean[1001];
//        for (int i = 2; i < 1001; i++) {
//            if (!s[i]) {
//                for (int j = 2; j < 1001; j++) {
//                    if (i*j >= 1001) {
//                        break;
//                    }
//                    s[i*j] = true;
//                }
//            }
//        }
//        boolean chk;
//        for (int i = 0; i < t; i++) {
//            int k = Integer.parseInt(br.readLine());
//            chk = true;
//            Loop1:
//            for (int a = 2; a < k; a++) {
//                for (int b = 2; b < k; b++) {
//                    if (s[a]) break;
//                    for (int c = 2; c < k; c++) {
//                        if (s[b]) break;
//                        if (!s[c] && a + b + c == k) {
//                            sb.append(a).append(" ").append(b).append(" ").append(c).append("\n");
//                            chk = false;
//                            break Loop1;
//                        }
//                    }
//                }
//            }
//            if (chk) {
//                sb.append(0 + "\n");
//            }
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

public class A11502 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        boolean[] s = new boolean[1001];
        for (int i = 2; i < 1001; i++) {
            if (!s[i]) {
                for (int j = 2; j < 1001; j++) {
                    if (i*j >= 1001) {
                        break;
                    }
                    s[i*j] = true;
                }
            }
        }
        boolean chk;
        for (int i = 0; i < t; i++) {
            int k = Integer.parseInt(br.readLine());
            chk = true;
            Loop1:
            for (int a = 2; a < k; a++) {
                if (s[a]) continue;
                for (int b = 2; b < k; b++) {
                    if (s[b]) continue;
                    for (int c = 2; c < k; c++) {
                        if (!s[c] && a + b + c == k) {
                            sb.append(a).append(" ").append(b).append(" ").append(c).append("\n");
                            chk = false;
                            break Loop1;
                        }
                    }
                }
            }
            if (chk) {
                sb.append(0 + "\n");
            }
        }
        System.out.println(sb);
        br.close();
    }
}
