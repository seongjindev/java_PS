package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class A16174 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dx = {1, 0};
        int[] dy = {0, 1};
        boolean[][] chk = new boolean[n][n];
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0, 0});
        chk[0][0] = true;
        while (!q.isEmpty()) {
            int[] poll = q.poll();
            for (int a = 0; a < 2; a++) {
                int x = poll[1] + dx[a]*arr[poll[0]][poll[1]];
                int y = poll[0] + dy[a]*arr[poll[0]][poll[1]];
                if (x >= 0 && x < n && y >= 0 && y < n) {
                    if (!chk[y][x]) {
                        chk[y][x] = true;
                        q.offer(new int[]{y, x});
                    }
                }
            }
        }
        if (chk[n - 1][n - 1]) {
            System.out.println("HaruHaru");
        } else {
            System.out.println("Hing");
        }
        br.close();
    }
}
