package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class A2667 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        boolean[][] chk = new boolean[n][n];
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }
        int sum = 0;
        Queue<Integer> qr = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i].charAt(j)=='1' && !chk[i][j]) {
                    sum++;
                    Queue<int[]> q = new LinkedList<>();
                    q.offer(new int[]{i, j});
                    chk[i][j] = true;
                    int hSize = 1;
                    while (!q.isEmpty()) {
                        int[] poll = q.poll();
                        for (int a = 0; a < 4; a++) {
                            int y = poll[0] + dy[a];
                            int x = poll[1] + dx[a];
                            if (y >= 0 && y < n && x >= 0 && x < n) {
                                if (!chk[y][x] && arr[y].charAt(x)=='1') {
                                    chk[y][x] = true;
                                    q.offer(new int[]{y, x});
                                    hSize++;
                                }
                            }
                        }
                    }
                    qr.offer(hSize);
                }
            }
        }
        System.out.println(sum);
        for (int i = 0; i < sum; i++) {
            System.out.println(qr.poll());
        }
        br.close();
    }
}
