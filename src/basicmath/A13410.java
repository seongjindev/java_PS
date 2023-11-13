package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//public class A13410 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int k = Integer.parseInt(st.nextToken());
//        StringBuilder sb = new StringBuilder();
//        int max = 0;
//        for (int i = 1; i <= k; i++) {
//            int num = n * i;
//            int ck = Integer.parseInt(String.valueOf(sb.append(num).reverse()));
//            max = Math.max(max, ck);
//            sb.setLength(0);
//        }
//        System.out.println(max);
//        br.close();
//    }
//}

//public class A13410 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int k = Integer.parseInt(st.nextToken());
//        StringBuilder sb = new StringBuilder();
//        int max = 0;
//        for (int i = 1; i <= k; i++) {
//            max = Math.max(max, Integer.parseInt(sb.append(n * i).reverse().toString()));
//            sb.setLength(0);
//        }
//        System.out.println(max);
//        br.close();
//    }
//}

public class A13410 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int max = 0;
        for (int i = 1; i <= k; i++) {
            int num = n * i;
            int re = 0;
            while (num != 0) {
                re *= 10;
                re += num % 10;
                num /= 10;
            }
            max = Math.max(max, re);
        }
        System.out.println(max);
        br.close();
    }
}
