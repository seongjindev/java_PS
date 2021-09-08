package greedy;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//public class A11034 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        String in = "";
//        while ((in = br.readLine()) != null ) {
//            StringTokenizer st = new StringTokenizer(in);
//            int rst = 0;
//            if(st.countTokens() < 3) {
//                break;
//            }
//            int a = Integer.parseInt(st.nextToken());
//            int b = Integer.parseInt(st.nextToken());
//            int c = Integer.parseInt(st.nextToken());
//            if (b - a >= c - b) {
//                rst = b - a - 1;
//            }else {
//                rst = c - b - 1;
//            }
//            sb.append(rst + "\n");
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A11034 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int rst = 0;
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                int c = Integer.parseInt(st.nextToken());
                if (b - a >= c - b) {
                    rst = b - a - 1;
                }else {
                    rst = c - b - 1;
                }
                sb.append(rst + "\n");
            } catch (Exception e) {
                break;
            }
        }
        System.out.println(sb);
        br.close();
    }
}