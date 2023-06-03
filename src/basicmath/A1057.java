package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//public class A1057 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        double n = Double.parseDouble(st.nextToken());
//        double a = Double.parseDouble(st.nextToken());
//        double b = Double.parseDouble(st.nextToken());
//        if (a > b) {
//            double c = a;
//            a = b;
//            b = c;
//        }
//        int cnt = 0;
//        for (int i = 0; i < Math.sqrt(n) + 1; i++) {
//            cnt++;
//            if (a % 2 == 1) {
//                if (b == a + 1) {
//                    break;
//                }
//            }
//            a = Math.ceil(a / 2);
//            b = Math.ceil(b / 2);
//        }
//        System.out.println(cnt);
//        br.close();
//    }
//}

//public class A1057 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        double n = Double.parseDouble(st.nextToken());
//        double a = Double.parseDouble(st.nextToken());
//        double b = Double.parseDouble(st.nextToken());
//        int cnt = 0;
//        for (int i = 0; i < Math.sqrt(n) + 1; i++) {
//            a = Math.ceil(a / 2);
//            b = Math.ceil(b / 2);
//            cnt++;
//            if (a == b) {
//                break;
//            }
//        }
//        System.out.println(cnt);
//        br.close();
//    }
//}

//public class A1057 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        double n = Double.parseDouble(st.nextToken());
//        double a = Double.parseDouble(st.nextToken());
//        double b = Double.parseDouble(st.nextToken());
//        int cnt = 0;
//        while (a != b) {
//            a = Math.ceil(a / 2);
//            b = Math.ceil(b / 2);
//            cnt++;
//        }
//        System.out.println(cnt);
//        br.close();
//    }
//}

public class A1057 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        st.nextToken();
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int cnt = 0;
        while (a != b) {
            a = a / 2 + a % 2;
            b = b / 2 + b % 2;
            cnt++;
        }
        System.out.println(cnt);
        br.close();
    }
}
