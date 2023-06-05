package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

//public class A2331 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int p = Integer.parseInt(st.nextToken());
//        int sum;
//        ArrayList<Integer> arr = new ArrayList<>();
//        arr.add(n);
//        while (true) {
//            sum = 0;
//            while (n != 0) {
//                sum += Math.pow(n % 10, p);
//                n /= 10;
//            }
//            if (arr.contains(sum)) {
//                break;
//            }
//            n = sum;
//            arr.add(n);
//        }
//        System.out.println(arr.indexOf(sum));
//        br.close();
//    }
//}

public class A2331 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        int rst;
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(n);
        while (true) {
            int sum = 0;
            while (n != 0) {
                sum += Math.pow(n % 10, p);
                n /= 10;
            }
            if (arr.contains(sum)) {
                rst = arr.indexOf(sum);
                break;
            }
            n = sum;
            arr.add(n);
        }
        System.out.println(rst);
        br.close();
    }
}