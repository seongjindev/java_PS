package ifps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//public class A2525 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int a = Integer.parseInt(st.nextToken());
//        int b = Integer.parseInt(st.nextToken());
//        int c = Integer.parseInt(br.readLine());
//        int total = b + c;
//        if (total >= 60) {
//            a = a + (total / 60);
//            total = total % 60;
//            if (a > 23) {
//                a = a - 24;
//            }
//        }
//        System.out.println(a + " " + total);
//    }
//}

public class A2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());
        int total = b + c;
        if (total >= 60) {
            a = (a + (total / 60))%24;
            total = total % 60;
        }
        System.out.println(a + " " + total);
    }
}