package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//public class A10707 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int[] arr = new int[5];
//        for (int i = 0; i < 5; i++) {
//            arr[i] = Integer.parseInt(br.readLine());
//        }
//        int x = arr[0] * arr[4];
//        int y = arr[1];
//        if (arr[2] < arr[4]) {
//            y += (arr[4] - arr[2]) * arr[3];
//        }
//        if (x <= y) {
//            System.out.println(x);
//        } else {
//            System.out.println(y);
//        }
//        br.close();
//    }
//}

public class A10707 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int x = arr[0] * arr[4];
        int y = arr[1];
        if (arr[2] < arr[4]) {
            y += (arr[4] - arr[2]) * arr[3];
        }
        System.out.println(Math.min(x, y));
        br.close();
    }
}
