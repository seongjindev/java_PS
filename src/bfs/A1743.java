package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class A1743 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        boolean[][] con = new boolean[n+1][m+1];
        boolean[][] chk = new boolean[n+1][m+1];
        for (int i = 1; i <= k; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            con[a][b] = true;
        }
        int max = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (con[i][j] && !chk[i][j]) {
                    chk[i][j] = true;
                    Queue<int[]> q = new LinkedList<>();
                    q.offer(new int[]{i,j});
                    int cnt = 0;
                    while (!q.isEmpty()) {
                        int[] poll = q.poll();
                        cnt++;
                        for (int a = 0; a < 4; a++) {
                            int x = poll[1] + dx[a];
                            int y = poll[0] + dy[a];
                            if (x > 0 && x <= m && y > 0 && y <= n) {
                                if (con[y][x] && !chk[y][x]) {
                                    chk[y][x] = true;
                                    q.offer(new int[]{y,x});
                                }
                            }
                        }
                    }
                    max = Math.max(max, cnt);
                }
            }
        }
        System.out.println(max);
        br.close();
    }
}
