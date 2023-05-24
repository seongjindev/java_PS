package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//public class A1568 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int cnt = 0;
//        int num = 1;
//        while (n > 0) {
//            if (n >= num) {
//                n -= num;
//                cnt++;
//                num++;
//            } else {
//                num = 1;
//            }
//        }
//        System.out.println(cnt);
//        br.close();
//    }
//}

public class A1568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        int num = 1;
        while (n > 0) {
            if (n < num) {
                num = 1;
            }
            n -= num;
            cnt++;
            num++;
        }
        System.out.println(cnt);
        br.close();
    }
}
