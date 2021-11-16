package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class A16948 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dx = {-2, -2, 0, 0, 2, 2};
        int[] dy = {-1, 1, -2, 2, -1, 1};
        StringTokenizer st = new StringTokenizer(br.readLine());
        int r1 = Integer.parseInt(st.nextToken());
        int c1 = Integer.parseInt(st.nextToken());
        int r2 = Integer.parseInt(st.nextToken());
        int c2 = Integer.parseInt(st.nextToken());
        int[][] chk = new int[n+1][n+1];
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{r1, c1});
        chk[r1][c1] = 1;
        while (!q.isEmpty()) {
            int[] poll = q.poll();
            if (poll[0] == r2 && poll[1] == c2) {
                break;
            }
            for (int i = 0; i < 6; i++) {
                int x = poll[0] + dx[i];
                int y = poll[1] + dy[i];
                if (x >= 0 && x <= n && y >= 0 && y <= n) {
                    if (chk[x][y] == 0) {
                        chk[x][y] = chk[poll[0]][poll[1]] + 1;
                        q.offer(new int[]{x, y});
                    }
                }
            }
        }
        System.out.println(chk[r2][c2]-1);
        br.close();
    }
}
