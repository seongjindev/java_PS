package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class A4963 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] dx = {1, 1, 0, -1, -1, -1, 0, 1};
        int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int w = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());
            if (w+h==0) {
                break;
            }
            int[][] land = new int[h][w];
            boolean[][] chk = new boolean[h][w];
            for (int i = 0; i < h; i++) {
                StringTokenizer st2 = new StringTokenizer(br.readLine());
                for (int j = 0; j < w; j++) {
                    land[i][j] = Integer.parseInt(st2.nextToken());
                }
            }
            int sum = 0;
            for (int a = 0; a < h; a++) {
                for (int b = 0; b < w; b++) {
                    if (land[a][b] == 1 && chk[a][b]==false) {
                        Queue<int[]> q = new LinkedList<>();
                        q.offer(new int[]{a,b});
                        chk[a][b] = true;
                        while (!q.isEmpty()) {
                            int[] poll = q.poll();
                            for (int x = 0; x < 8; x++) {
                                int px = poll[1] + dx[x];
                                int py = poll[0] + dy[x];
                                if (px >= 0 && px < w && py >= 0 && py < h) {
                                    if (land[py][px] == 1 && chk[py][px]==false) {
                                        chk[py][px] = true;
                                        q.offer(new int[]{py, px});
                                    }
                                }
                            }
                        }
                        sum++;
                    }
                }
            }
            sb.append(sum).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}
