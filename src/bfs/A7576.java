package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class A7576 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int[][] app = new int[n][m];
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                app[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (app[i][j]==1) {
                    q.offer(new int[]{i, j});
                }
            }
        }
        while (!q.isEmpty()) {
            int[] poll = q.poll();
            for (int a = 0; a < 4; a++) {
                int y = poll[0] + dy[a];
                int x = poll[1] + dx[a];
                if (x >= 0 && x < m && y >= 0 && y < n) {
                    if (app[y][x] == 0) {
                        app[y][x] = app[poll[0]][poll[1]] + 1;
                        q.offer(new int[]{y, x});
                    }
                }
            }
        }
        boolean chk = false;
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (app[i][j]==0) {
                    chk = true;
                }else {
                    max = Math.max(max, app[i][j]);
                }
            }
        }
        if (chk) {
            System.out.println(-1);
        }else {
            System.out.println(max-1);
        }
        br.close();
    }
}
