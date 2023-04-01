package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//public class A11005 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int b = Integer.parseInt(st.nextToken());
//        System.out.println(Integer.toString(n, b).toUpperCase());
//        br.close();
//    }
//}

public class A11005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        while (true) {
            int remain = n % b;
            n = (n - remain) / b;
            char ch = 0;
            if (remain > 9) {
                ch = (char)(remain + 55);
                sb.insert(0, ch);
            } else {
                sb.insert(0, remain);
            }
            if (n < b) {
                if (n > 9) {
                    ch = (char)(n + 55);
                    sb.insert(0, ch);
                } else {
                    sb.insert(0, n);
                }
                break;
            }
        }
        System.out.println(sb);
        br.close();
    }
}
