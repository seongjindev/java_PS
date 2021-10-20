package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class A3184 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        String[] arr = new String[r];
        boolean[][] chk = new boolean[r][c];
        for (int i = 0; i < r; i++) {
            arr[i] = br.readLine();
        }
        int dSheep = 0;
        int dWolf = 0;
        int rWolf = 0;
        int rSheep = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (arr[i].charAt(j)=='v') {
                    rWolf++;
                }
                if (arr[i].charAt(j)=='o') {
                    rSheep++;
                }
                if (arr[i].charAt(j)=='v') {
                    int sheep = 0;
                    int wolf = 1;
                    chk[i][j] = true;
                    Queue<int[]> q = new LinkedList<>();
                    q.offer(new int[]{i,j});
                    while (!q.isEmpty()) {
                        int[] poll = q.poll();
                        for (int a = 0; a < 4; a++) {
                            int x = poll[1] + dx[a];
                            int y = poll[0] + dy[a];
                            if (x >= 0 && x < c && y >= 0 && y < r) {
                                if (!chk[y][x] && arr[y].charAt(x)!='#') {
                                    chk[y][x] = true;
                                    q.offer(new int[]{y, x});
                                    if (arr[y].charAt(x)=='o') {
                                        sheep++;
                                    }
                                    if (arr[y].charAt(x)=='v') {
                                        wolf++;
                                    }
                                }
                            }
                        }
                    }
                    if (sheep > wolf) {
                        dWolf += wolf;
                    }else {
                        dSheep += sheep;
                    }
                }
            }
        }
        System.out.println((rSheep-dSheep) + " " + (rWolf-dWolf));
        br.close();
    }
}
