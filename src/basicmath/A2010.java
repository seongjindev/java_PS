package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//public class A2010 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int sum = Integer.parseInt(br.readLine());
//        for (int i = 0; i < n - 1; i++) {
//            int c = Integer.parseInt(br.readLine());
//            sum += c - 1;
//        }
//        System.out.println(sum);
//        br.close();
//    }
//}

public class A2010 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Integer.parseInt(br.readLine()) - 1;
        }
        System.out.println(sum + 1);
        br.close();
    }
}

