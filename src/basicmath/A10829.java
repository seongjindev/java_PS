package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//public class A10829 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        long n = Long.parseLong(br.readLine());
//        System.out.println(Long.toBinaryString(n));
//        br.close();
//    }
//}

public class A10829 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(Long.toBinaryString(Long.parseLong(br.readLine())));
        br.close();
    }
}
