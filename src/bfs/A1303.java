package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class A1303 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        char[] bw = {'B','W'};
        String[] war = new String[m];
        for (int i = 0; i < m; i++) {
            war[i] = br.readLine();
        }
        int[] rst = new int[2];
        for (int i = 0; i < 2; i++) {
            boolean[][] chk = new boolean[m][n];
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < n; k++) {
                    if (war[j].charAt(k)==bw[i] && !chk[j][k]) {
                        int sum = 1;
                        chk[j][k] = true;
                        Queue<int[]> q = new LinkedList<>();
                        q.offer(new int[]{j,k});
                        while (!q.isEmpty()) {
                            int[] poll = q.poll();
                            for (int a = 0; a < 4; a++) {
                                int x = poll[1] + dx[a];
                                int y = poll[0] + dy[a];
                                if (x >= 0 && x < n && y >= 0 && y < m) {
                                    if (!chk[y][x] && war[y].charAt(x)==bw[i]) {
                                        chk[y][x] = true;
                                        q.offer(new int[]{y, x});
                                        sum++;
                                    }
                                }
                            }
                        }
                        rst[i] += Math.pow(sum, 2);
                    }
                }
            }
        }
        System.out.println(rst[1] + " " + rst[0]);
        br.close();
    }
}
