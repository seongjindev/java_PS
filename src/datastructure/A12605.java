package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.ArrayDeque;
import java.util.Deque;

//public class A12605 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        StringTokenizer st;
//        Deque<String> dq = new ArrayDeque<>();
//        StringBuilder sb = new StringBuilder();
//        for (int i = 1; i < n + 1; i++) {
//            st = new StringTokenizer(br.readLine());
//            sb.append("Case #").append(i).append(": ");
//            while (st.hasMoreTokens()) {
//                dq.push(st.nextToken());
//            }
//            dq.forEach(s -> sb.append(s).append(" "));
//            sb.append("\n");
//            dq.clear();
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

public class A12605 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        Stack<String> sk = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < n + 1; i++) {
            st = new StringTokenizer(br.readLine());
            sb.append("Case #").append(i).append(": ");
            while (st.hasMoreTokens()) {
                sk.push(st.nextToken());
            }
            while (!sk.isEmpty()) {
                sb.append(sk.pop()).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}