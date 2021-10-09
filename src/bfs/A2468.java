package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class A2468 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        int min = 101;
        int max = 0;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                min = Math.min(min, arr[i][j]);
                max = Math.max(max, arr[i][j]);
            }
        }
        int rst = 0;
        for (int m = min-1; m < max; m++) {
            int sum = 0;
            boolean[][] chk = new boolean[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (arr[i][j] <= m || chk[i][j]) {
                        chk[i][j] = true;
                        continue;
                    }
                    sum++;
                    Queue<int[]> q = new LinkedList<>();
                    q.offer(new int[]{i, j});
                    chk[i][j] = true;
                    while (!q.isEmpty()) {
                        int[] poll = q.poll();
                        for (int k = 0; k < 4; k++) {
                            int x = poll[1] + dx[k];
                            int y = poll[0] + dy[k];
                            if (x >= 0 && x < n && y >= 0 && y < n) {
                                if (arr[y][x] > m &&!chk[y][x]) {
                                    chk[y][x] = true;
                                    q.offer(new int[]{y, x});
                                }
                            }
                        }
                    }
                }
            }
            rst = Math.max(rst, sum);
        }
        System.out.println(rst);
        br.close();
    }
}
