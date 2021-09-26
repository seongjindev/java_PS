package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class A2606 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int com = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        boolean[][] nd = new boolean[com+1][com+1];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            nd[a][b] = true;
            nd[b][a] = true;
        }
        Queue<Integer> q = new LinkedList<>();
        boolean[] chk = new boolean[com+1];
        q.offer(1);
        chk[1] = true;
        while(!q.isEmpty()) {
            Integer poll = q.poll();
            for (int i = 1; i <= com; i++) {
                if (nd[poll][i] && chk[i]==false) {
                    chk[i] = true;
                    q.offer(i);
                }
            }
        }
        int sum = 0;
        for (boolean b : chk) {
            if (b) {
                sum++;
            }
        }
        System.out.println(sum-1);
        br.close();
    }
}
