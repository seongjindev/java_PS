package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class A13565 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        String[] arr = new String[m];
        boolean[][] chk = new boolean[m][n];
        String rst = "NO";
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, -1, 0, 1};
        for (int i = 0; i < m; i++) {
            arr[i] = br.readLine();
        }
        for (int i = 0; i < n; i++) {
            if (arr[m-1].charAt(i)!='0') {
                continue;
            }
            Queue<int[]> q = new LinkedList<>();
            q.offer(new int[]{m-1, i});
            chk[m-1][i] = true;
            while (!q.isEmpty()) {
                int[] poll = q.poll();
                if (poll[0] == 0) {
                    rst = "YES";
                    break;
                }
                for (int a = 0; a < 4; a++) {
                    int x = poll[1] + dx[a];
                    int y = poll[0] + dy[a];
                    if (x >= 0 && x < n && y >= 0 && y < m) {
                        if (arr[y].charAt(x) == '0' && !chk[y][x]) {
                            chk[y][x] = true;
                            q.offer(new int[]{y, x});
                        }
                    }
                }
            }
        }
        System.out.println(rst);
        br.close();
    }
}
