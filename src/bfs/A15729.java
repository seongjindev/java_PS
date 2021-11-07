package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class A15729 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        String[] gd = new String[n];
        for (int i = 0; i < n; i++) {
            gd[i] = br.readLine();
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (gd[i].charAt(j) == 'L') {
                    int[][] chk = new int[n][m];
                    Queue<int[]> q = new LinkedList<>();
                    q.offer(new int[]{i, j});
                    chk[i][j] = 1;
                    while (!q.isEmpty()) {
                        int[] poll = q.poll();
                        for (int a = 0; a < 4; a++) {
                            int x = poll[1] + dx[a];
                            int y = poll[0] + dy[a];
                            if (x >= 0 && x < m && y >= 0 && y < n) {
                                if (gd[y].charAt(x) == 'L' && chk[y][x] == 0) {
                                    q.offer(new int[]{y, x});
                                    chk[y][x] = chk[poll[0]][poll[1]] + 1;
                                    max = Math.max(max, chk[y][x]);
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(max-1);
        br.close();
    }
}
