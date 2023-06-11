package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//public class A6219 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int a = Integer.parseInt(st.nextToken());
//        int b = Integer.parseInt(st.nextToken());
//        int c = Integer.parseInt(st.nextToken());
//        boolean[] box = new boolean[b + 1];
//        box[1] = true;
//        for (int i = 2; i <= b; i++) {
//            for (int j = 2; j <= b; j++) {
//                if (i * j > b) {
//                    break;
//                }
//                if (!box[i * j]) box[i * j] = true;
//            }
//        }
//        int rst = 0;
//        for (int i = a; i <= b; i++) {
//            if (!box[i]) {
//                int chk = i;
//                while (chk != 0) {
//                    int mod = chk % 10;
//                    if (mod == c) {
//                        rst++;
//                        break;
//                    }
//                    chk /= 10;
//                }
//            }
//        }
//        System.out.println(rst);
//        br.close();
//    }
//}

//public class A6219 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int a = Integer.parseInt(st.nextToken());
//        int b = Integer.parseInt(st.nextToken());
//        int c = Integer.parseInt(st.nextToken());
//        boolean[] box = new boolean[b + 1];
//        box[1] = true;
//        for (int i = 2; i <= b; i++) {
//            for (int j = 2; j <= b; j++) {
//                if (i * j > b) {
//                    break;
//                }
//                if (!box[i * j]) box[i * j] = true;
//            }
//        }
//        int rst = 0;
//        for (int i = a; i <= b; i++) {
//            if (!box[i]) {
//                int chk = i;
//                while (chk != 0) {
//                    if (chk % 10 == c) {
//                        rst++;
//                        break;
//                    }
//                    chk /= 10;
//                }
//            }
//        }
//        System.out.println(rst);
//        br.close();
//    }
//}

public class A6219 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        boolean[] box = new boolean[b + 1];
        box[1] = true;
        for (int i = 2; i <= b; i++) {
            if (!box[i]) {
                for (int j = 2; j <= b; j++) {
                    if (i * j > b) {
                        break;
                    }
                    if (!box[i * j]) box[i * j] = true;
                }
            }
        }
        int rst = 0;
        for (int i = a; i <= b; i++) {
            if (!box[i]) {
                int chk = i;
                while (chk != 0) {
                    if (chk % 10 == c) {
                        rst++;
                        break;
                    }
                    chk /= 10;
                }
            }
        }
        System.out.println(rst);
        br.close();
    }
}