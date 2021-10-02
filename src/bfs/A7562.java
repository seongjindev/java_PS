package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class A7562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int[] dx = {2, 1, -1, -2, -2, -1, 1, 2};
        int[] dy = {1, 2, 2, 1, -1, -2, -2, -1};
        for (int i = 0; i < tc; i++) {
            int n = Integer.parseInt(br.readLine());
            int[][] na = new int[n][n];
            boolean[][] chk = new boolean[n][n];
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st1.nextToken());
            int y1 = Integer.parseInt(st1.nextToken());
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int x2 = Integer.parseInt(st2.nextToken());
            int y2 = Integer.parseInt(st2.nextToken());
            Queue<int[]> q = new LinkedList<>();
            q.offer(new int[]{x1, y1});
            chk[x1][y1] = true;
            while (!q.isEmpty()) {
                int[] poll = q.poll();
                if (poll[0]==x2 && poll[1]==y2) {
                    break;
                }
                for (int a = 0; a < 8; a++) {
                    int x = poll[0] + dx[a];
                    int y = poll[1] + dy[a];
                    if (x >= 0 && x < n && y >= 0 && y < n) {
                        if (!chk[x][y]) {
                            chk[x][y] = true;
                            na[x][y] = na[poll[0]][poll[1]] + 1;
                            q.offer(new int[]{x, y});
                        }
                    }
                }
            }
            sb.append(na[x2][y2]).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}
