package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//public class A1773 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int c = Integer.parseInt(st.nextToken());
//        int[] t = new int[2000001];
//        for (int i = 0; i < n; i++) {
//            int num = Integer.parseInt(br.readLine());
//            for (int j = 1; j <= c; j++) {
//                if (num * j > c) break;
//                t[num * j]++;
//            }
//        }
//        int rst = 0;
//        for (int i = 1; i <= c; i++) {
//            if (t[i] > 0) rst++;
//        }
//        System.out.println(rst);
//        br.close();
//    }
//}

//public class A1773 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int c = Integer.parseInt(st.nextToken());
//        int[] t = new int[2000001];
//        int rst = 0;
//        for (int i = 0; i < n; i++) {
//            int num = Integer.parseInt(br.readLine());
//            for (int j = 1; j <= c; j++) {
//                if (num * j > c) break;
//                if (t[num * j] > 0) continue;
//                t[num * j]++;
//                rst++;
//            }
//        }
//        System.out.println(rst);
//        br.close();
//    }
//}

//public class A1773 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int c = Integer.parseInt(st.nextToken());
//        int[] t = new int[2000001];
//        int rst = 0;
//        for (int i = 0; i < n; i++) {
//            int num = Integer.parseInt(br.readLine());
//            for (int j = 1; j <= c; j++) {
//                if (num * j > c) break;
//                if (t[num * j] == 0) {
//                    t[num * j]++;
//                    rst++;
//                }
//            }
//        }
//        System.out.println(rst);
//        br.close();
//    }
//}

//public class A1773 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int c = Integer.parseInt(st.nextToken());
//        boolean[] t = new boolean[2000001];
//        for (int i = 0; i < n; i++) {
//            int num = Integer.parseInt(br.readLine());
//            for (int j = 1; j <= c; j++) {
//                if (num * j > c) break;
//                t[num * j] = true;
//            }
//        }
//        int rst = 0;
//        for (int i = 1; i <= c; i++) {
//            if (t[i]) rst++;
//        }
//        System.out.println(rst);
//        br.close();
//    }
//}

public class A1773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        boolean[] t = new boolean[2000001];
        int rst = 0;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            for (int j = 1; j <= c; j++) {
                if (num * j > c) break;
                if (t[num * j]) continue;
                t[num * j] = true;
                rst++;
            }
        }
        System.out.println(rst);
        br.close();
    }
}