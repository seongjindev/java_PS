package basicmath;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//public class A10250 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int cnt = Integer.parseInt(br.readLine());
//        for(int i = 0; i < cnt; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            int h = Integer.parseInt(st.nextToken());
//            int w = Integer.parseInt(st.nextToken());
//            int n = Integer.parseInt(st.nextToken());
//            int a = (int)Math.ceil((double)n/h);
//            int b = (n%h==0)? h : n%h;
//            if(a<10) {
//                System.out.println(b + "0" + a);
//            }else {
//                System.out.println(b + "" + a);
//            }
//        }
//        br.close();
//    }
//}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int cnt = Integer.parseInt(br.readLine());
        for(int i = 0; i < cnt; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            int a = (int)Math.ceil((double)n/h);
            int b = (n%h==0)? h : n%h;
            sb.append((b*100) + a);
            sb.append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}
