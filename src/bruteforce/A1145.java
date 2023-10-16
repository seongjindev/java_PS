package bruteforce;

import java.io.*;
import java.util.StringTokenizer;

//public class A1145 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int[] fi = new int[5];
//        for (int i = 0; i < 5; i++) {
//            fi[i] = Integer.parseInt(st.nextToken());
//        }
//        int cnt;
//        int rst;
//        int num = 1;
//        while (true) {
//            cnt = 0;
//            for (int i = 0; i < 5; i++) {
//                if (num % fi[i] == 0) {
//                    cnt++;
//                }
//            }
//            if (cnt >= 3) {
//                rst = num;
//                break;
//            }
//            num++;
//        }
//        System.out.println(rst);
//        br.close();
//    }
//}

//public class A1145 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int[] fi = new int[5];
//        for (int i = 0; i < 5; i++) {
//            fi[i] = Integer.parseInt(st.nextToken());
//        }
//        int num = 1;
//        while (true) {
//            int cnt = 0;
//            for (int i = 0; i < 5; i++) {
//                if (num % fi[i] == 0) {
//                    cnt++;
//                }
//            }
//            if (cnt >= 3) {
//                break;
//            }
//            num++;
//        }
//        System.out.println(num);
//        br.close();
//    }
//}

//public class A1145 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int[] fi = new int[5];
//        for (int i = 0; i < 5; i++) {
//            fi[i] = Integer.parseInt(st.nextToken());
//        }
//        int num = 1;
//        while (true) {
//            int cnt = 0;
//            for (int i = 0; i < 5; i++) {
//                if (num % fi[i] == 0) {
//                    cnt++;
//                }
//            }
//            if (cnt >= 3) {
//                bw.write(String.valueOf(num));
//                break;
//            }
//            num++;
//        }
//        bw.flush();
//        bw.close();
//        br.close();
//    }
//}

public class A1145 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] fi = new int[5];
        for (int i = 0; i < 5; i++) {
            fi[i] = Integer.parseInt(st.nextToken());
        }
        int num = 1;
        while (true) {
            int cnt = 0;
            if (num % fi[0] == 0) cnt++;
            if (num % fi[1] == 0) cnt++;
            if (num % fi[2] == 0) cnt++;
            if (num % fi[3] == 0) cnt++;
            if (num % fi[4] == 0) cnt++;
            if (cnt >= 3) {
                break;
            }
            num++;
        }
        System.out.println(num);
        br.close();
    }
}