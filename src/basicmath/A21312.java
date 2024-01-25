package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//public class A21312 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        Integer[] arr = new Integer[3];
//        int odd = 0;
//        for (int i = 0; i < 3; i++) {
//            arr[i] = Integer.parseInt(st.nextToken());
//            if (arr[i] % 2 == 1) {
//                odd++;
//            }
//        }
//        int rst = 1;
//        if (odd == 1 || odd == 2) {
//            for (int i = 0; i < 3; i++) {
//                if (arr[i] % 2 == 1) {
//                    rst *= arr[i];
//                }
//            }
//        } else {
//            rst = arr[0] * arr[1] * arr[2];
//        }
//        System.out.println(rst);
//        br.close();
//    }
//}

//public class A21312 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        Integer[] arr = new Integer[3];
//        int odd = 1;
//        int all = 1;
//        boolean ck = false;
//        for (int i = 0; i < 3; i++) {
//            arr[i] = Integer.parseInt(st.nextToken());
//            if (arr[i] % 2 == 1) {
//                ck = true;
//                odd *= arr[i];
//            }
//            all *= arr[i];
//        }
//        if (ck) {
//            System.out.println(odd);
//        } else {
//            System.out.println(all);
//        }
//        br.close();
//    }
//}

public class A21312 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int odd = 1;
        int rst = 1;
        boolean ck = false;
        for (int i = 0; i < 3; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (num % 2 == 1) {
                ck = true;
                odd *= num;
            }
            rst *= num;
        }
        if (ck) rst = odd;
        System.out.println(rst);
        br.close();
    }
}
