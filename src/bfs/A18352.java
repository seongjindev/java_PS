package bfs;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.LinkedList;
//import java.util.PriorityQueue;
//import java.util.Queue;
//import java.util.StringTokenizer;
//
//public class A18352 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int m = Integer.parseInt(st.nextToken());
//        int k = Integer.parseInt(st.nextToken());
//        int x = Integer.parseInt(st.nextToken());
//        int[] arr = new int[n+1];
//        boolean[] chk = new boolean[n+1];
//        boolean[][] nd = new boolean[n+1][n+1];
//        for (int i = 1; i <= m; i++) {
//            st = new StringTokenizer(br.readLine());
//            int a = Integer.parseInt(st.nextToken());
//            int b = Integer.parseInt(st.nextToken());
//            nd[a][b] = true;
//        }
//        Queue<Integer> rst = new PriorityQueue<>();
//        Queue<Integer> q = new LinkedList<>();
//        q.offer(x);
//        chk[x] = true;
//        while (!q.isEmpty()) {
//            Integer poll = q.poll();
//            if (arr[poll]==k) {
//                rst.offer(poll);
//                continue;
//            }
//            for (int i = 1; i <= n; i++) {
//                if (nd[poll][i] && !chk[i]) {
//                    chk[i] = true;
//                    q.offer(i);
//                    arr[i] = arr[poll] + 1;
//                }
//            }
//        }
//        StringBuilder sb = new StringBuilder();
//        if (rst.isEmpty()) {
//            sb.append("-1");
//        }else {
//            while (!rst.isEmpty()) {
//                sb.append(rst.poll()).append("\n");
//            }
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class A18352 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int[] arr = new int[n+1];
        boolean[] chk = new boolean[n+1];
        ArrayList<Integer>[] nd = new ArrayList[n+1];
        for (int i = 1; i <= n; i++) {
            nd[i] = new ArrayList<>();
        }
        for (int i = 1; i <= m; i++) {
            st = new StringTokenizer(br.readLine());
            nd[Integer.parseInt(st.nextToken())].add(Integer.parseInt(st.nextToken()));
        }
        Queue<Integer> rst = new PriorityQueue<>();
        Queue<Integer> q = new LinkedList<>();
        q.offer(x);
        chk[x] = true;
        while (!q.isEmpty()) {
            Integer poll = q.poll();
            if (arr[poll]==k) {
                rst.offer(poll);
                continue;
            }
            for (int i = 0; i < nd[poll].size(); i++) {
                Integer integer = nd[poll].get(i);
                if (!chk[nd[poll].get(i)]) {
                    chk[nd[poll].get(i)] = true;
                    q.offer(integer);
                    arr[nd[poll].get(i)] = arr[poll] + 1;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        if (rst.isEmpty()) {
            sb.append(-1);
        }else {
            while (!rst.isEmpty()) {
                sb.append(rst.poll()).append("\n");
            }
        }
        System.out.println(sb);
        br.close();
    }
}