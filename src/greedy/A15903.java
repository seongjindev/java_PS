package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class A15903 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        Queue<Long> q = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            q.offer(Long.parseLong(st2.nextToken()));
        }
        for (int i = 0; i < m; i++) {
            long sum = q.poll() + q.poll();
            q.offer(sum);
            q.offer(sum);
        }
        long rst = 0;
        for (Long l : q) {
            rst += l;
        }
        System.out.println(rst);
        br.close();
    }
}
