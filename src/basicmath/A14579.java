package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//public class A14579 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int a = Integer.parseInt(st.nextToken());
//        int b = Integer.parseInt(st.nextToken());
//        long sum = 1;
//        for (int i = a; i <= b; i++) {
//            if (i % 2 == 0) {
//                sum *= ((long) (1 + i) * (i / 2));
//            } else {
//                sum *= (((long) (1 + i) * (i / 2)) + ((i / 2) + 1));
//            }
//            sum %= 14579;
//        }
//        System.out.println(sum);
//        br.close();
//    }
//}

//public class A14579 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int a = Integer.parseInt(st.nextToken());
//        int b = Integer.parseInt(st.nextToken());
//        int sum = 1;
//        for (int i = a; i <= b; i++) {
//            sum *= (i * (1 + i)) / 2;
//            sum %= 14579;
//        }
//        System.out.println(sum);
//        br.close();
//    }
//}

//public class A14579 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int a = Integer.parseInt(st.nextToken());
//        int b = Integer.parseInt(st.nextToken());
//        int sum = (a * (1 + a)) / 2;
//        int rst = 1;
//        for (int i = 1; i <= b - a + 1; i++) {
//            rst *= sum;
//            rst %= 14579;
//            sum += a + i;
//        }
//        System.out.println(rst);
//        br.close();
//    }
//}

public class A14579 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int sum = (a * (1 + a)) / 2;
        int rst = sum;
        for (int i = a + 1; i <= b; i++) {
            sum += i;
            rst *= sum;
            rst %= 14579;
        }
        System.out.println(rst);
        br.close();
    }
}