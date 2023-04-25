package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//public class A2576 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int[] box = new int[7];
//        int sum = 0;
//        for (int i = 0; i < 7; i++) {
//            box[i] = Integer.parseInt(br.readLine());
//            if (box[i] % 2 == 1) {
//                sum += box[i];
//            }
//        }
//        if (sum == 0) {
//            System.out.println(-1);
//        } else {
//            Arrays.sort(box);
//            for (int i = 0; i < 7; i++) {
//                if (box[i] % 2 == 1) {
//                    System.out.println(sum);
//                    System.out.println(box[i]);
//                    break;
//                }
//            }
//        }
//    }
//}

public class A2576 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int min = 101;
        for (int i = 0; i < 7; i++) {
            int n = Integer.parseInt(br.readLine());
            if (n % 2 == 1) {
                sum += n;
                min = Math.min(min, n);
            }
        }
        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum + "\n" + min);
        }
    }
}
