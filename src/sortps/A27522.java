package sortps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

//public class A27522 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String[][] arr = new String[8][4];
//        int[] score = {10, 8, 6, 5, 4, 3, 2, 1};
//        for (int i = 0; i < 8; i++) {
//            String[] sp = br.readLine().split(" ");
//            String[] tm = sp[0].split(":");
//            arr[i][0] = tm[0];
//            arr[i][1] = tm[1];
//            arr[i][2] = tm[2];
//            arr[i][3] = sp[1];
//        }
//        Arrays.sort(arr, (o1, o2) -> {
//            if (o1[0].equals(o2[0])) {
//                if (o1[1].equals(o2[1])) {
//                    return Integer.parseInt(o1[2]) - Integer.parseInt(o2[2]);
//                } else {
//                    return Integer.parseInt(o1[1]) - Integer.parseInt(o2[1]);
//                }
//            } else {
//                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
//            }
//        });
//        int red = 0;
//        int blue = 0;
//        for (int i = 0; i < 8; i++) {
//            if (arr[i][3].equals("R")) {
//                red += score[i];
//            } else {
//                blue += score[i];
//            }
//        }
//        if (red > blue) {
//            System.out.println("Red");
//        } else {
//            System.out.println("Blue");
//        }
//        br.close();
//    }
//}

public class A27522 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[][] arr = new String[8][2];
        int[] score = {10, 8, 6, 5, 4, 3, 2, 1};
        for (int i = 0; i < 8; i++) {
            String[] sp = br.readLine().split(" ");
            arr[i][0] = sp[0];
            arr[i][1] = sp[1];
        }
        Arrays.sort(arr, (o1, o2) -> o1[0].compareTo(o2[0]));
        int red = 0;
        int blue = 0;
        for (int i = 0; i < 8; i++) {
            if (arr[i][1].equals("R")) {
                red += score[i];
            } else {
                blue += score[i];
            }
        }
        if (red > blue) {
            System.out.println("Red");
        } else {
            System.out.println("Blue");
        }
        br.close();
    }
}
