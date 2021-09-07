package twopointer;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Arrays;
//import java.util.StringTokenizer;
//
//public class A2470 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int cnt = Integer.parseInt(br.readLine());
//        int[] arr = new int[cnt];
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        for (int i = 0; i < cnt; i++) {
//            arr[i] = Integer.parseInt(st.nextToken());
//        }
//        Arrays.sort(arr);
//        int stn = 0;
//        int edn = cnt-1;
//        int sum = 0;
//        int min = Math.abs(arr[stn] + arr[edn]);
//        String rst = arr[stn] + " " + arr[edn];
//        while (stn < edn) {
//            sum = Math.abs(arr[stn] + arr[edn]);
//            if(sum==0) {
//                rst = arr[stn] + " " + arr[edn];
//                break;
//            }
//            if (sum < min) {
//                min = sum;
//                rst = arr[stn] + " " + arr[edn];
//            }
//            if(Math.abs(arr[stn+1] + arr[edn]) < Math.abs(arr[stn] + arr[edn-1])) {
//                stn++;
//            }else {
//                edn--;
//            }
//        }
//        System.out.println(rst);
//        br.close();
//    }
//}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A2470 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int[] arr = new int[cnt];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < cnt; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int stn = 0;
        int edn = cnt-1;
        int sum;
        int min = 2000000000;
        String rst = "";
        while (stn < edn) {
            sum = arr[stn] + arr[edn];
            if(sum==0) {
                rst = arr[stn] + " " + arr[edn];
                break;
            }
            if (Math.abs(sum) < min) {
                min = Math.abs(sum);
                rst = arr[stn] + " " + arr[edn];
            }
            if(sum > 0) {
                edn--;
            }else {
                stn++;
            }
        }
        System.out.println(rst);
        br.close();
    }
}

