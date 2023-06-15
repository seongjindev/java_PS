package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Collections;

//public class A16208 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        Integer[] bar = new Integer[n];
//        long sum = 0;
//        long rst = 0;
//        for (int i = 0; i < n; i++) {
//            bar[i] = Integer.parseInt(st.nextToken());
//            sum += bar[i];
//        }
//        Arrays.sort(bar, Collections.reverseOrder());
//        for (int i = 0; i < n; i++) {
//            sum -= bar[i];
//            rst += sum * bar[i];
//        }
//        System.out.println(rst);
//        br.close();
//    }
//}

//public class A16208 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        Integer[] bar = new Integer[n];
//        long sum = 0;
//        long rst = 0;
//        for (int i = 0; i < n; i++) {
//            bar[i] = Integer.parseInt(st.nextToken());
//            sum += bar[i];
//        }
//        for (int i = 0; i < n; i++) {
//            sum -= bar[i];
//            rst += sum * bar[i];
//        }
//        System.out.println(rst);
//        br.close();
//    }
//}

public class A16208 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Integer[] bar = new Integer[n];
        long sum = 0;
        long rst = 0;
        for (int i = 0; i < n; i++) {
            bar[i] = Integer.parseInt(st.nextToken());
            rst += sum * bar[i];
            sum += bar[i];
        }
        System.out.println(rst);
        br.close();
    }
}