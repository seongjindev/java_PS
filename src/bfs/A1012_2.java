package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class A1012_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int tc = Integer.parseInt(br.readLine());
        int[] posX = {1, 0, -1, 0};
        int[] posY = {0, 1, 0, -1};
        for (int i = 0; i < tc; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            boolean[][] arr = new boolean[m][n];
            boolean[][] chk = new boolean[m][n];
            for (int j = 0; j < k; j++) {
                StringTokenizer st2 = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st2.nextToken());
                int b = Integer.parseInt(st2.nextToken());
                arr[a][b] = true;
            }
            int cnt = 0;
            for (int a = 0; a < m; a++) {
                for (int b = 0; b < n; b++) {
                    if (arr[a][b] && chk[a][b] ==false) {
                        Queue<int[]> q = new LinkedList<>();
                        q.offer(new int[]{a,b});
                        while (!q.isEmpty()) {
                            int[] poll = q.poll();
                            for (int c = 0; c < 4; c++) {
                                int ex = poll[0]+posX[c];
                                int ey = poll[1]+posY[c];
                                if (ex < m && ey < n && ex >= 0 && ey >= 0) {
                                    if (arr[ex][ey] && chk[ex][ey]==false) {
                                        chk[ex][ey] = true;
                                        q.offer(new int[]{ex, ey});
                                    }
                                }
                            }
                        }
                        cnt++;
                    }
                }
            }
            sb.append(cnt).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}
