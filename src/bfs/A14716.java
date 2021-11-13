package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class A14716 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int[] dx = {1, 1, 0, -1, -1, -1, 0, 1};
        int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int cnt = 0;
        boolean[][] chk = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 1 && !chk[i][j]) {
                    cnt++;
                    Queue<int[]> q = new LinkedList<>();
                    q.offer(new int[]{i, j});
                    chk[i][j] = true;
                    while (!q.isEmpty()) {
                        int[] poll = q.poll();
                        for (int a = 0; a < 8; a++) {
                            int y = poll[0] + dy[a];
                            int x = poll[1] + dx[a];
                            if (x >= 0 && x < n && y >= 0 && y < m) {
                                if (!chk[y][x] && arr[y][x] == 1) {
                                    chk[y][x] = true;
                                    q.offer(new int[]{y, x});
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(cnt);
        br.close();
    }
}
