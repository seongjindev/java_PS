package sortps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//public class A2822 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int[][] arr = new int[8][2];
//        for (int i = 0; i < 8; i++) {
//            arr[i][0] = Integer.parseInt(br.readLine());
//            arr[i][1] = i + 1;
//        }
//        Arrays.sort(arr, ((o1, o2) -> {
//            if (o1[0] == o2[0]) {
//                return Integer.compare(o2[1], o1[1]);
//            } else {
//                return Integer.compare(o2[0], o1[0]);
//            }
//        }));
//        Integer[] od = new Integer[5];
//        int sum = 0;
//        for (int i = 0; i < 5; i++) {
//            sum += arr[i][0];
//            od[i] = arr[i][1];
//        }
//        Arrays.sort(od);
//        System.out.println(sum);
//        for (int i : od) {
//            System.out.print(i + " ");
//        }
//        br.close();
//    }
//}

public class A2822 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[8][2];
        for (int i = 0; i < 8; i++) {
            arr[i][0] = Integer.parseInt(br.readLine());
            arr[i][1] = i + 1;
        }
        Arrays.sort(arr, ((o1, o2) -> {
            if (o1[0] == o2[0]) {
                return Integer.compare(o2[1], o1[1]);
            } else {
                return Integer.compare(o2[0], o1[0]);
            }
        }));
        int[] od = new int[5];
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += arr[i][0];
            od[i] = arr[i][1];
        }
        Arrays.sort(od);
        System.out.println(sum);
        for (int i : od) {
            System.out.print(i + " ");
        }
        br.close();
    }
}
