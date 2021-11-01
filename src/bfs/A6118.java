package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class A6118 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        ArrayList<Integer>[] list = new ArrayList[n+1];
        for (int i = 1; i <= n; i++) {
            list[i] = new ArrayList<>();
        }
        boolean[] chk = new boolean[n+1];
        int[] dis = new int[n+1];
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list[a].add(b);
            list[b].add(a);
        }
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        chk[1] = true;
        dis[1] = 0;
        int max = 0;
        while (!q.isEmpty()) {
            Integer poll = q.poll();
            for (int i = 0; i < list[poll].size(); i++) {
                Integer getI = list[poll].get(i);
                if (!chk[getI]) {
                    q.offer(getI);
                    chk[getI] = true;
                    dis[getI] = dis[poll] + 1;
                    max = Math.max(max, dis[getI]);
                }
            }
        }
        int cnt = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 1; i <= n; i++) {
            if (dis[i] == max) {
                cnt++;
                min = Math.min(min, i);
            }
        }
        System.out.println(min + " " + max + " " + cnt);
        br.close();
    }
}
