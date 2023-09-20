package sortps;

import java.util.Arrays;
import java.util.Scanner;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;

//public class A9076 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int t = Integer.parseInt(br.readLine());
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < t; i++) {
//            String[] sp = br.readLine().split(" ");
//            Arrays.sort(sp, Comparator.comparingInt(Integer::parseInt));
//            if (Integer.parseInt(sp[3]) - Integer.parseInt(sp[1]) >= 4) {
//                sb.append("KIN");
//            } else {
//                sb.append(Integer.parseInt(sp[1]) + Integer.parseInt(sp[2]) + Integer.parseInt(sp[3]));
//            }
//            sb.append("\n");
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

public class A9076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            int[] arr = new int[5];
            for (int j = 0; j < 5; j++) {
                arr[j] = sc.nextInt();
            }
            Arrays.sort(arr);
            if (arr[3] - arr[1] >= 4) {
                sb.append("KIN");
            } else {
                sb.append(arr[1] + arr[2] + arr[3]);
            }
            sb.append("\n");
        }
        System.out.println(sb);
        sc.close();
    }
}