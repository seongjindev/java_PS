package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

//public class A2959 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int[] arr = new int[4];
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        for (int i = 0; i < 4; i++) {
//            arr[i] = Integer.parseInt(st.nextToken());
//        }
//        Arrays.sort(arr);
//        System.out.println(arr[0] * arr[2]);
//        br.close();
//    }
//}

//public class A2959 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String[] sp = br.readLine().split(" ");
//        Arrays.sort(sp, Comparator.comparingInt(Integer::parseInt));
//        System.out.println(Integer.parseInt(sp[0]) * Integer.parseInt(sp[2]));
//        br.close();
//    }
//}

public class A2959 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(arr);
        System.out.println(arr[0] * arr[2]);
        br.close();
    }
}