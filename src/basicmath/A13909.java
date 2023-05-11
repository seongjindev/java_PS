package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//public class A13909 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int cnt = 0;
//        for(int i = 1; i * i <= n; i++) {
//            cnt++;
//        }
//        System.out.println(cnt);
//        br.close();
//    }
//}

//public class A13909 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        System.out.println((int)Math.sqrt(n));
//        br.close();
//    }
//}

public class A13909 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()) + 1;
        boolean[] window = new boolean[n];
        int rst = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n/i+1; j++) {
                if (i*j >= n) {
                    break;
                }
                window[i*j] = !window[i*j];
                if (j==1) {
                    if (window[i*j]) {
                        rst++;
                    }
                }
            }
        }
        System.out.println(rst);
        br.close();
    }
}