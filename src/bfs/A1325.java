package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class A1325 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        List<Integer>[] list = new ArrayList[n+1];
        for (int i = 1; i <= n; i++) {
            list[i] = new ArrayList<>();
        }
        int[] sum = new int[n+1];
        boolean[] chk;
        int max = 0;
        int a,b;
        for (int i = 1; i <= m; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st2.nextToken());
            b = Integer.parseInt(st2.nextToken());
            list[b].add(a);
        }
        for (int i = 1; i <= n; i++) {
            Queue<Integer> q = new LinkedList<>();
            q.offer(i);
            chk = new boolean[n+1];
            chk[i] = true;
            while(!q.isEmpty()) {
                Integer poll = q.poll();
                for (Integer j : list[poll]) {
                    if (!chk[j]) {
                        chk[j]=true;
                        q.offer(j);
                        sum[i]++;
                    }
                }
            }
            max = Math.max(max, sum[i]);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (sum[i] == max) {
                sb.append(i).append(" ");
            }
        }
        System.out.println(sb);
        br.close();
    }
}
