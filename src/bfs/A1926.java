package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class A1926 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int cnt = 0;
        int maxSize = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j]==1) {
                    int size = 1;
                    cnt++;
                    Queue<int[]> q = new LinkedList<>();
                    q.offer(new int[]{i,j});
                    arr[i][j] = 2;
                    while (!q.isEmpty()) {
                        int[] poll = q.poll();
                        for (int a = 0; a < 4; a++) {
                            int x = poll[1] + dx[a];
                            int y = poll[0] + dy[a];
                            if (x >= 0 && x < m && y >= 0 && y < n) {
                                if (arr[y][x]==1) {
                                    arr[y][x] = 2;
                                    size++;
                                    q.offer(new int[]{y, x});
                                }
                            }
                        }
                    }
                    maxSize = Math.max(maxSize, size);
                }
            }
        }
        System.out.println(cnt);
        System.out.println(maxSize);
        br.close();
    }
}
