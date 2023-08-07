package queueps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//public class A1158 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int k = Integer.parseInt(st.nextToken());
//        Queue<Integer> qu = new LinkedList<>();
//        for (int i = 1; i <= n; i++) {
//            qu.offer(i);
//        }
//        StringBuilder sb = new StringBuilder("<");
//        while (!qu.isEmpty()) {
//            for (int i = 0; i < k - 1; i++) {
//                qu.offer(qu.poll());
//            }
//            sb.append(qu.poll());
//            if (qu.size() > 0) {
//                sb.append(", ");
//            } else {
//                sb.append(">");
//            }
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

//public class A1158 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int k = Integer.parseInt(st.nextToken());
//        Deque<Integer> qu = new ArrayDeque<>();
//        for (int i = 1; i <= n; i++) {
//            qu.offer(i);
//        }
//        StringBuilder sb = new StringBuilder("<");
//        while (!qu.isEmpty()) {
//            for (int i = 0; i < k - 1; i++) {
//                qu.offer(qu.poll());
//            }
//            sb.append(qu.poll());
//            if (qu.size() > 0) {
//                sb.append(", ");
//            } else {
//                sb.append(">");
//            }
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

//public class A1158 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int k = Integer.parseInt(st.nextToken());
//        Deque<Integer> qu = new ArrayDeque<>();
//
//        for (int i = 1; i <= n; i++) {
//            qu.offer(i);
//        }
//        StringBuilder sb = new StringBuilder("<");
//        while (!qu.isEmpty()) {
//            for (int i = 0; i < k - 1; i++) {
//                qu.offerLast(qu.pollFirst());
//            }
//            sb.append(qu.pollFirst());
//            if (qu.size() > 0) {
//                sb.append(", ");
//            } else {
//                sb.append(">");
//            }
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

//public class A1158 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int k = Integer.parseInt(st.nextToken());
//        Queue<Integer> qu = new ArrayDeque<>();
//        for (int i = 1; i <= n; i++) {
//            qu.offer(i);
//        }
//        StringBuilder sb = new StringBuilder("<");
//        while (!qu.isEmpty()) {
//            for (int i = 0; i < k - 1; i++) {
//                qu.offer(qu.poll());
//            }
//            sb.append(qu.poll());
//            if (qu.size() > 0) {
//                sb.append(", ");
//            } else {
//                sb.append(">");
//            }
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

public class A1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        List<Integer> ls = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            ls.add(i);
        }
        StringBuilder sb = new StringBuilder("<");
        int idx = k - 1;
        while (!ls.isEmpty()) {
            sb.append(ls.remove(idx));
            if (ls.size() == 0) break;
            sb.append(", ");
            idx = (idx + k - 1) % ls.size();
        }
        sb.append(">");
        System.out.println(sb);
        br.close();
    }
}