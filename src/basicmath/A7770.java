package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//public class A7770 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int b = 1;
//        int h = 0;
//        int m = 1;
//        while (n >= b) {
//            h++;
//            m = (h * 4) + m;
//            b += m;
//        }
//        System.out.println(h);
//        br.close();
//    }
//}

public class A7770 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int b = 1;
        int h = 0;
        int m = 1;
        while (n >= b) {
            h++;
            m += h * 4;
            b += m;
        }
        System.out.println(h);
        br.close();
    }
}