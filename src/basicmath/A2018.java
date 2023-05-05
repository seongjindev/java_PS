package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//public class A2018 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int cnt = 0;
//        for (int i = 1; i <= n ; i++) {
//            int sum = 0;
//            for (int j = i; j <= n; j++) {
//                sum += j;
//                if (sum == n) {
//                    cnt++;
//                    break;
//                }
//                if (sum > n) {
//                    break;
//                }
//            }
//        }
//        System.out.println(cnt);
//        br.close();
//    }
//}

public class A2018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 1;
        for (int i = 1; i <= (n*2)/3 ; i++) {
            int sum = 0;
            for (int j = i; j <= (n*2)/3; j++) {
                sum += j;
                if (sum == n) {
                    cnt++;
                    break;
                }
                if (sum > n) {
                    break;
                }
            }
        }
        System.out.println(cnt);
        br.close();
    }
}
