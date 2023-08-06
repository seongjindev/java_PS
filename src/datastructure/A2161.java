package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

//public class A2161 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        Queue<Integer> qu = new LinkedList<>();
//        for (int i = 1; i <= n; i++) {
//            qu.add(i);
//        }
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < n; i++) {
//            sb.append(qu.peek()).append(" ");
//            qu.remove();
//            qu.add(qu.poll());
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

//public class A2161 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        Queue<Integer> qu = new LinkedList<>();
//        for (int i = 1; i <= n; i++) {
//            qu.add(i);
//        }
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < n; i++) {
//            sb.append(qu.poll()).append(" ");
//            qu.add(qu.poll());
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

public class A2161 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> qu = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            qu.offer(i);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(qu.poll()).append(" ");
            qu.offer(qu.poll());
        }
        System.out.println(sb);
        br.close();
    }
}