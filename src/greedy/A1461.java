package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class A1461 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        Queue<Integer> q1 = new PriorityQueue<>();
        Queue<Integer> q2 = new PriorityQueue<>(Collections.reverseOrder());
        int max = 0;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st2.nextToken());
            if (num < 0) {
                q1.offer(num);
            }else {
                q2.offer(num);
            }
            max = Math.max(max, Math.abs(num));
        }
        int sum = 0;
        int a = 0;
        int b = 0;
        while (!q1.isEmpty()) {
            if (!q1.isEmpty()) {
                a = q1.poll();
            }
            for (int i = 1; i < m; i++) {
                if (!q1.isEmpty()) {
                    q1.poll();
                }
            }
            sum += Math.abs(a)*2;
        }
        while(!q2.isEmpty()) {
            if (!q2.isEmpty()) {
                b = q2.poll();
            }
            for (int i = 1; i < m; i++) {
                if (!q2.isEmpty()) {
                    q2.poll();
                }
            }
            sum += b*2;
        }
        System.out.println(sum - max);
        br.close();
    }
}
