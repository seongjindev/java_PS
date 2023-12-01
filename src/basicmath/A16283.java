package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//public class A16283 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int a = Integer.parseInt(st.nextToken());
//        int b = Integer.parseInt(st.nextToken());
//        int n = Integer.parseInt(st.nextToken());
//        int w = Integer.parseInt(st.nextToken());
//        int cnt = 0;
//        int sh = 1;
//        int rstSh = 0;
//        int rstGo = 0;
//        while (sh < n) {
//            int go = n - sh;
//            if ((sh * a) + (go * b) == w) {
//                cnt++;
//                rstSh = sh;
//                rstGo = go;
//            }
//            sh++;
//        }
//        if (cnt >= 2 || cnt == 0) {
//            System.out.println("-1");
//        } else {
//            System.out.println(rstSh + " " + rstGo);
//        }
//        br.close();
//    }
//}

//public class A16283 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int a = Integer.parseInt(st.nextToken());
//        int b = Integer.parseInt(st.nextToken());
//        int n = Integer.parseInt(st.nextToken());
//        int w = Integer.parseInt(st.nextToken());
//        int cnt = 0;
//        int rstSh = 0;
//        int rstGo = 0;
//        for (int i = 1; i < n; i++) {
//            if ((i * a) + ((n - i) * b) == w) {
//                cnt++;
//                rstSh = i;
//                rstGo = n - i;
//            }
//        }
//        if (cnt >= 2 || cnt == 0) {
//            System.out.println("-1");
//        } else {
//            System.out.println(rstSh + " " + rstGo);
//        }
//        br.close();
//    }
//}

public class A16283 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int cnt = 0;
        int rstSh = 0;
        int rstGo = 0;
        for (int i = 1; i < n; i++) {
            if ((i * a) + ((n - i) * b) == w) {
                cnt++;
                rstSh = i;
                rstGo = n - i;
            }
        }
        if (cnt == 1) {
            System.out.println(rstSh + " " + rstGo);
        } else {
            System.out.println("-1");
        }
        br.close();
    }
}
