package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//public class A11576 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        StringBuilder sb = new StringBuilder();
//        int a = Integer.parseInt(st.nextToken());
//        int b = Integer.parseInt(st.nextToken());
//        int m = Integer.parseInt(br.readLine());
//        st = new StringTokenizer(br.readLine());
//        int sum = 0;
//        for (int i = m - 1; i >= 0; i--) {
//            sum += Integer.parseInt(st.nextToken()) * (int)Math.pow(a, i);
//        }
//        while (sum != 0) {
//            int i = sum % b;
//            sb.insert(0, i + " ");
//            sum /= b;
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

public class A11576 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int sum = 0;
        for(int i = 0; i < m; i++) {
            sum *= a;
            sum += Integer.parseInt(st.nextToken());
        }
        while (sum != 0) {
            int i = sum % b;
            sb.insert(0, i + " ");
            sum /= b;
        }
        System.out.println(sb);
        br.close();
    }
}

