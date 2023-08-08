package queueps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

//public class A15828 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        Queue<Integer> qu = new LinkedList<>();
//        while (true) {
//            int in = Integer.parseInt(br.readLine());
//            if (in == -1) {
//                break;
//            }
//            if (in == 0) {
//                qu.poll();
//                continue;
//            }
//            if (qu.size() < n) {
//                qu.offer(in);
//            }
//        }
//        StringBuilder sb = new StringBuilder();
//        if (qu.size() > 0) {
//            while (!qu.isEmpty()) {
//                sb.append(qu.poll()).append(" ");
//            }
//            System.out.println(sb);
//        } else {
//            System.out.println("empty");
//        }
//        br.close();
//    }
//}

public class A15828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> qu = new ArrayDeque<>();
        while (true) {
            int in = Integer.parseInt(br.readLine());
            if (in == -1) {
                break;
            }
            if (in == 0) {
                qu.poll();
                continue;
            }
            if (qu.size() < n) {
                qu.offer(in);
            }
        }
        StringBuilder sb = new StringBuilder();
        if (qu.size() > 0) {
            while (!qu.isEmpty()) {
                sb.append(qu.poll()).append(" ");
            }
            System.out.println(sb);
        } else {
            System.out.println("empty");
        }
        br.close();
    }
}