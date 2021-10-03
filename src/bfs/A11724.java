package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class A11724 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        boolean[][] nd = new boolean[n+1][n+1];
        boolean[] chk = new boolean[n+1];
        for (int i = 0; i < m; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st2.nextToken());
            int b = Integer.parseInt(st2.nextToken());
            nd[a][b] = true;
            nd[b][a] = true;
        }
        int sum = 0;
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            if (!chk[i]) {
                q.offer(i);
                chk[i] = true;
                while(!q.isEmpty()) {
                    Integer poll = q.poll();
                    for (int j = 1; j <= n; j++) {
                        if (nd[poll][j]==true && !chk[j]) {
                            chk[j] = true;
                            q.offer(j);
                        }
                    }
                }
                sum++;
            }
        }
        System.out.println(sum);
        br.close();
    }
}
