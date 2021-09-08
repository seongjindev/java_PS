package greedy;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Arrays;
//import java.util.Collections;
//
//public class A1417 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int cnt = Integer.parseInt(br.readLine());
//        int a = Integer.parseInt(br.readLine());
//        Integer[] b = new Integer[cnt];
//        b[0] = 0;
//        for(int i = 1; i < cnt; i++) {
//            b[i] = Integer.parseInt(br.readLine());
//        }
//        int rst = 0;
//        while (true) {
//            Arrays.sort(b, Collections.reverseOrder());
//            if(a <= b[0]) {
//                a++;
//                b[0]--;
//                rst++;
//            }else {
//                break;
//            }
//        }
//        System.out.println(rst);
//        br.close();
//    }
//}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class A1417 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int a = Integer.parseInt(br.readLine());
        Queue<Integer> q = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        for(int i = 1; i < cnt; i++) {
            q.offer(Integer.parseInt(br.readLine()));
        }
        int rst = 0;
        while (!(q.isEmpty())) {
            if(a <= q.peek()) {
                a++;
                Integer poll = q.poll();
                q.offer(poll-1);
                rst++;
            }else {
                break;
            }
        }
        System.out.println(rst);
        br.close();
    }
}
