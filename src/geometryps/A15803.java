package geometryps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Comparator;

//public class A15803 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int[][] arr = new int[3][2];
//        for (int i = 0; i < 3; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            arr[i][0] = Integer.parseInt(st.nextToken());
//            arr[i][1] = Integer.parseInt(st.nextToken());
//        }
//        Arrays.sort(arr, Comparator.comparingInt(o -> o[0]));
//        int a1 = arr[1][0] - arr[0][0];
//        int a2 = arr[1][1] - arr[0][1];
//        if (a1 == 0 && arr[0][0] == arr[2][0]) {
//            System.out.println("WHERE IS MY CHICKEN?");
//        } else if (a2 == 0 && arr[0][1] == arr[2][1]) {
//            System.out.println("WHERE IS MY CHICKEN?");
//        } else if (a1 != 0 && (a2 * arr[2][0]) / a1 == arr[2][1]) {
//            System.out.println("WHERE IS MY CHICKEN?");
//        } else {
//            System.out.println("WINNER WINNER CHICKEN DINNER!");
//        }
//        br.close();
//    }
//}

//public class A15803 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int[][] arr = new int[3][2];
//        for (int i = 0; i < 3; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            arr[i][0] = Integer.parseInt(st.nextToken());
//            arr[i][1] = Integer.parseInt(st.nextToken());
//        }
//        int a1 = arr[1][0] - arr[0][0];
//        int a2 = arr[1][1] - arr[0][1];
//        if (a1 == 0 && arr[0][0] == arr[2][0]) {
//            System.out.println("WHERE IS MY CHICKEN?");
//        } else if (a2 == 0 && arr[0][1] == arr[2][1]) {
//            System.out.println("WHERE IS MY CHICKEN?");
//        } else if (a1 != 0 && (a2 * arr[2][0]) / a1 == arr[2][1]) {
//            System.out.println("WHERE IS MY CHICKEN?");
//        } else {
//            System.out.println("WINNER WINNER CHICKEN DINNER!");
//        }
//        br.close();
//    }
//}

//public class A15803 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int[][] arr = new int[3][2];
//        for (int i = 0; i < 3; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            arr[i][0] = Integer.parseInt(st.nextToken());
//            arr[i][1] = Integer.parseInt(st.nextToken());
//        }
//        int a1 = arr[1][0] - arr[0][0];
//        int a2 = arr[1][1] - arr[0][1];
//        if ((a1 == 0 && arr[0][0] == arr[2][0]) || (a2 == 0 && arr[0][1] == arr[2][1]) || a1 != 0 && (a2 * arr[2][0]) / a1 == arr[2][1]) {
//            System.out.println("WHERE IS MY CHICKEN?");
//        } else {
//            System.out.println("WINNER WINNER CHICKEN DINNER!");
//        }
//        br.close();
//    }
//}

public class A15803 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[3][2];
        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        int a1 = arr[1][0] - arr[0][0];
        int a2 = arr[1][1] - arr[0][1];
        int b1 = arr[2][0] - arr[1][0];
        int b2 = arr[2][1] - arr[1][1];
        if (a2 * b1 == b2 * a1) {
            System.out.println("WHERE IS MY CHICKEN?");
        } else {
            System.out.println("WINNER WINNER CHICKEN DINNER!");
        }
        br.close();
    }
}