package stringps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

//public class A17176 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        char[] chNum = new char[n];
//        for (int i = 0; i < n; i++) {
//            int num = Integer.parseInt(st.nextToken());
//            if (num == 0) {
//                chNum[i] = ' ';
//            } else if (num <= 26) {
//                chNum[i] = (char)(num + 64);
//            } else {
//                chNum[i] = (char)(num + 70);
//            }
//        }
//        char[] chStr = br.readLine().toCharArray();
//        Arrays.sort(chNum);
//        Arrays.sort(chStr);
//        String rst = "y";
//        for (int i = 0; i < n; i++) {
//            if (chNum[i] != chStr[i]) {
//                rst = "n";
//                break;
//            }
//        }
//        System.out.println(rst);
//        br.close();
//    }
//}

//public class A17176 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        char[] chNum = new char[53];
//        for (int i = 0; i < n; i++) {
//            chNum[Integer.parseInt(st.nextToken())]++;
//        }
//        char[] chStr = br.readLine().toCharArray();
//        String rst = "y";
//        for (int i = 0; i < n; i++) {
//            int num = chStr[i];
//            if (chStr[i] == ' ') {
//                if (chNum[0] > 0) {
//                    chNum[0]--;
//                } else {
//                    rst = "n";
//                    break;
//                }
//            } else if (num >= 65 && num <= 90) {
//                if (chNum[num - 64] > 0) {
//                    chNum[num - 64]--;
//                } else {
//                    rst = "n";
//                    break;
//                }
//            } else {
//                if (chNum[num - 70] > 0) {
//                    chNum[num - 70]--;
//                } else {
//                    rst = "n";
//                    break;
//                }
//            }
//        }
//        System.out.println(rst);
//        br.close();
//    }
//}

//public class A17176 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        char[] chNum = new char[53];
//        for (int i = 0; i < n; i++) {
//            chNum[Integer.parseInt(st.nextToken())]++;
//        }
//        char[] chStr = br.readLine().toCharArray();
//        String rst = "y";
//        for (int i = 0; i < n; i++) {
//            int num = chStr[i];
//            if (num == 32) {
//                if (chNum[0] > 0) {
//                    chNum[0]--;
//                } else {
//                    rst = "n";
//                    break;
//                }
//            } else if (num >= 65 && num <= 90) {
//                if (chNum[num - 64] > 0) {
//                    chNum[num - 64]--;
//                } else {
//                    rst = "n";
//                    break;
//                }
//            } else {
//                if (chNum[num - 70] > 0) {
//                    chNum[num - 70]--;
//                } else {
//                    rst = "n";
//                    break;
//                }
//            }
//        }
//        System.out.println(rst);
//        br.close();
//    }
//}

//public class A17176 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        char[] chNum = new char[n];
//        for (int i = 0; i < n; i++) {
//            int num = Integer.parseInt(st.nextToken());
//            if (num == 0) {
//                chNum[i] = ' ';
//            } else if (num >= 1 && num <= 26) {
//                chNum[i] = (char)(num + 64);
//            } else {
//                chNum[i] = (char)(num + 70);
//            }
//        }
//        char[] chStr = br.readLine().toCharArray();
//        Arrays.sort(chNum);
//        Arrays.sort(chStr);
//        String rst = "y";
//        for (int i = 0; i < n; i++) {
//            if (chNum[i] != chStr[i]) {
//                rst = "n";
//                break;
//            }
//        }
//        System.out.println(rst);
//        br.close();
//    }
//}

public class A17176 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        char[] chNum = new char[n];
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (num == 0) {
                chNum[i] = ' ';
            } else if (num >= 1 && num <= 26) {
                chNum[i] = (char)(num + 64);
            } else {
                chNum[i] = (char)(num + 70);
            }
        }
        char[] chStr = br.readLine().toCharArray();
        Arrays.sort(chNum);
        Arrays.sort(chStr);
        boolean ck = true;
        for (int i = 0; i < n; i++) {
            if (chNum[i] != chStr[i]) {
                ck = false;
                break;
            }
        }
        System.out.println(ck ? "y" : "n");
        br.close();
    }
}