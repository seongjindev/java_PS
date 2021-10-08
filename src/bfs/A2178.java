package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class A2178 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String[] arr = new String[n];
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }
        Queue<int[]> q = new LinkedList<>();
        boolean[][] chk = new boolean[n][m];
        int[][] cnt = new int[n][m];
        q.offer(new int[]{0, 0});
        chk[0][0] = true;
        while (!q.isEmpty()) {
            int[] poll = q.poll();
            if (poll[0] == n-1 && poll[1] == m-1) {
                break;
            }
            for (int i = 0; i < 4; i++) {
                int x = poll[1] + dx[i];
                int y = poll[0] + dy[i];
                if (x >= 0 && x < m && y >= 0 && y < n) {
                    if (!chk[y][x] && arr[y].charAt(x) == '1') {
                        chk[y][x] = true;
                        q.offer(new int[]{y, x});
                        cnt[y][x] = cnt[poll[0]][poll[1]] + 1;
                    }
                }
            }
        }
        System.out.println(cnt[n-1][m-1]+1);
        br.close();
    }
}
