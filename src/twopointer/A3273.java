package twopointer;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.StringTokenizer;
//
//public class A3273 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int cnt = Integer.parseInt(br.readLine());
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        Map<Integer, Integer> nums = new HashMap<>();
//        for(int i = 0; i<cnt; i++) {
//            int num = Integer.parseInt(st.nextToken());
//            nums.put(num, 0);
//        }
//        int k = Integer.parseInt(br.readLine());
//        int rst = 0;
//        for (Integer integer : nums.keySet()) {
//            if(nums.containsKey(k-integer)) {
//                rst++;
//            }
//        }
//        System.out.println(rst/2);
//        br.close();
//    }
//}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A3273 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int k = Integer.parseInt(br.readLine());
        int rst = 0;
        int[] arr = new int[cnt];
        for(int i = 0; i<cnt; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int stn = 0;
        int edn = cnt-1;
        while(stn<edn) {
            int sum = arr[stn]+arr[edn];
            if(k == sum) {
                rst++;
                edn--;
                stn++;
            }else if(k>sum) {
                stn++;
            }else if(k<sum) {
                edn--;
            }
        }
        System.out.println(rst);
        br.close();
    }
}

