package priorityqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

//public class A23757 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int m = Integer.parseInt(st.nextToken());
//        PriorityQueue<Integer> ps = new PriorityQueue<>(Collections.reverseOrder());
//        int[] ch = new int[m];
//        st = new StringTokenizer(br.readLine());
//        for (int i = 0; i < n; i++) {
//            ps.offer(Integer.parseInt(st.nextToken()));
//        }
//        st = new StringTokenizer(br.readLine());
//        for (int i = 0; i < m; i++) {
//            ch[i] = Integer.parseInt(st.nextToken());
//        }
//        boolean chk = true;
//        int box;
//        for (int i = 0; i < m; i++) {
//            box = ps.poll();
//            if (box < ch[i]) {
//                chk = false;
//                break;
//            }
//            ps.offer(box - ch[i]);
//        }
//        if (chk) {
//            System.out.println(1);
//        } else {
//            System.out.println(0);
//        }
//        br.close();
//    }
//}

public class A23757 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        PriorityQueue<Integer> ps = new PriorityQueue<>(Collections.reverseOrder());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            ps.offer(Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine());
        int rst = 1;
        for (int i = 0; i < m; i++) {
            int box = ps.poll();
            int ch = Integer.parseInt(st.nextToken());
            if (box < ch) {
                rst = 0;
                break;
            }
            ps.offer(box - ch);
        }
        System.out.println(rst);
        br.close();
    }
}