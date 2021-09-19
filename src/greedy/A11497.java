package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class A11497 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tc; i++) {
            int n = Integer.parseInt(br.readLine());
            Queue<Integer> q = new PriorityQueue();
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                q.offer(Integer.parseInt(st.nextToken()));
            }
            LinkedList<Integer> list = new LinkedList<>();
            int fir = q.peek();
            int last = q.peek();
            int max = 0;
            list.add(q.poll());
            for (int k = 1; k < n; k++) {
                if (k%2==0) {
                    max = Math.max(max, Math.abs(last-q.peek()));
                    last = q.peek();
                    list.addLast(q.poll());
                }else {
                    max = Math.max(max, Math.abs(fir-q.peek()));
                    fir = q.peek();
                    list.addFirst(q.poll());
                }
            }
            max = Math.max(max, Math.abs(list.get(0) - list.get(n-1)));
            sb.append(max + "\n");
        }
        System.out.println(sb);
        br.close();
    }
}
