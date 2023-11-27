package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//public class A2909 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int c = Integer.parseInt(st.nextToken());
//        int k = Integer.parseInt(st.nextToken());
//        long rst = Math.round(c / Math.pow(10, k)) * (long) Math.pow(10, k);
//        System.out.println(rst);
//        br.close();
//    }
//}

public class A2909 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int c = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int rst = (int) Math.round(c / Math.pow(10, k)) * (int) Math.pow(10, k);
        System.out.println(rst);
        br.close();
    }
}