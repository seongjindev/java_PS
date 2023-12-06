package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//public class A21567 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        long n = (long) Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
//        int[] arr = new int[10];
//        String s = Long.toString(n);
//        for (int i = 0; i < s.length(); i++) {
//            arr[s.charAt(i) - '0']++;
//        }
//        for (int i : arr) {
//            System.out.println(i);
//        }
//        br.close();
//    }
//}

public class A21567 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = Long.toString(Long.parseLong(br.readLine()) * Long.parseLong(br.readLine()) * Long.parseLong(br.readLine()));
        int[] arr = new int[10];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - '0']++;
        }
        for (int i : arr) {
            System.out.println(i);
        }
        br.close();
    }
}