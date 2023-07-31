package prefixsumps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//public class A2851 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int[] arr = new int[11];
//        for (int i = 1; i < 11; i++) {
//            arr[i] = arr[i - 1] + Integer.parseInt(br.readLine());
//        }
//        int rst = 0;
//        for (int i = 1; i < 11; i++) {
//            if (Math.abs(100 - arr[i]) <= Math.abs(100 - rst)) {
//                if (arr[i] > rst) {
//                    rst = arr[i];
//                }
//            }
//        }
//        System.out.println(rst);
//        br.close();
//    }
//}

public class A2851 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int rst = 0;
        int sum = 0;
        for (int i = 1; i < 11; i++) {
            sum += Integer.parseInt(br.readLine());
            if (Math.abs(100 - sum) <= Math.abs(100 - rst)) {
                if (sum > rst) {
                    rst = sum;
                }
            }
        }
        System.out.println(rst);
        br.close();
    }
}
