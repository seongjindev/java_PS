package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//public class A2858 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int r = Integer.parseInt(st.nextToken());
//        int b = Integer.parseInt(st.nextToken());
//        int l = 3;
//        int w = 3;
//        while (l * w != r + b || (l - 2) * (w - 2) != b) {
//            if (l * w < r + b) {
//                l++;
//            } else if (l * w >= r + b) {
//                w++;
//                l = w;
//            }
//        }
//        System.out.println(l + " " + w);
//        br.close();
//    }
//}

//public class A2858 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int r = Integer.parseInt(st.nextToken());
//        int b = Integer.parseInt(st.nextToken());
//        int lw = r / 2 + 2;
//        int l = 3;
//        int w = 3;
//        while (l * w != r + b || (l - 2) * (w - 2) != b) {
//            if (l * w < r + b) {
//                l++;
//            } else if (l * w >= r + b || l + w > lw) {
//                w++;
//                l = w;
//            }
//        }
//        System.out.println(l + " " + w);
//        br.close();
//    }
//}

//public class A2858 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int r = Integer.parseInt(st.nextToken());
//        int b = Integer.parseInt(st.nextToken());
//        int lw = r / 2 + 2;
//        for (int i = 3; i <= lw; i++) {
//            if (i * (lw - i) == r + b) {
//                System.out.println(Math.max(i, (lw - i)) + " " + Math.min(i, (lw - i)));
//                break;
//            }
//        }
//        br.close();
//    }
//}

public class A2858 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int lw = r / 2 + 2;
        boolean ck = false;
        for (int i = 3; i <= lw; i++) {
            for (int j = i; j <= lw - i; j++) {
                if (i * j == r + b) {
                    System.out.println(j + " " + i);
                    ck = true;
                    break;
                }
            }
            if (ck) break;
        }
        br.close();
    }
}