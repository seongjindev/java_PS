package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class A1758 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        Queue<Integer> q = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for(int i = 0; i<cnt; i++) {
            q.offer(Integer.parseInt(br.readLine()));
        }
        long sum = 0;
        for(int i = 1; i <= cnt; i++) {
            int tip = q.poll()-(i-1);
            if(tip>0) {
                sum+=tip;
            }
        }
        System.out.println(sum);
        br.close();
    }
}
