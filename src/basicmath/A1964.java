package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//public class A1964 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        long rst = (5 + ((n - 1) * (2 * 7 + (long) (n - 2) * 3) / 2)) % 45678;
//        System.out.println(rst);
//        br.close();
//    }
//}

public class A1964 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long rst = 5;
        long sum = 7;
        for (int i = 1; i < n; i++) {
            rst += sum;
            sum += 3;
        }
        System.out.println(rst % 45678);
        br.close();
    }
}