package bfs;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.LinkedList;
//import java.util.PriorityQueue;
//import java.util.Queue;
//import java.util.StringTokenizer;
//
//public class A2583 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        StringBuilder sb = new StringBuilder();
//        int m = Integer.parseInt(st.nextToken());
//        int n = Integer.parseInt(st.nextToken());
//        int k = Integer.parseInt(st.nextToken());
//        int[][] arr = new int[n][m];
//        int[] dx = {1, 0, -1, 0};
//        int[] dy = {0, 1, 0, -1};
//        for (int i = 0; i < k; i++) {
//            st = new StringTokenizer(br.readLine());
//            int x1 = Integer.parseInt(st.nextToken());
//            int y1 = Integer.parseInt(st.nextToken());
//            int x2 = Integer.parseInt(st.nextToken());
//            int y2 = Integer.parseInt(st.nextToken());
//            for (int a = x1; a < x2; a++) {
//                for (int b = y1; b < y2; b++) {
//                    arr[a][b] = 1;
//                }
//            }
//        }
//        int rst = 0;
//        Queue<Integer> qr = new PriorityQueue<>();
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                if (arr[i][j]==1) {
//                    continue;
//                }
//                rst++;
//                int land = 1;
//                Queue<int[]> q = new LinkedList<>();
//                q.offer(new int[]{i, j});
//                arr[i][j]=1;
//                while (!q.isEmpty()) {
//                    int[] poll = q.poll();
//                    for (int a = 0; a < 4; a++) {
//                        int px = poll[0] + dx[a];
//                        int py = poll[1] + dy[a];
//                        if (px >= 0 && px < n && py >= 0 && py < m) {
//                            if (arr[px][py] != 1) {
//                                arr[px][py] = 1;
//                                q.offer(new int[]{px, py});
//                                land++;
//                            }
//                        }
//                    }
//                }
//                qr.offer(land);
//            }
//        }
//        for (int i = 0; i < rst; i++) {
//            sb.append(qr.poll()).append(" ");
//        }
//        System.out.println(rst);
//        System.out.println(sb);
//        br.close();
//    }
//}


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class A2583 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[][] arr = new int[m][n]; //5, 7
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            for (int a = x1; a < x2; a++) {
                for (int b = y1; b < y2; b++) {
                    arr[b][a] = 1;
                }
            }
        }
        int rst = 0;
        Queue<Integer> qr = new PriorityQueue<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j]==1) {
                    continue;
                }
                rst++;
                int land = 1;
                Queue<int[]> q = new LinkedList<>();
                q.offer(new int[]{i, j});
                arr[i][j]=1;
                while (!q.isEmpty()) {
                    int[] poll = q.poll();
                    for (int a = 0; a < 4; a++) {
                        int px = poll[1] + dx[a];
                        int py = poll[0] + dy[a];
                        if (px >= 0 && px < n && py >= 0 && py < m) {
                            if (arr[py][px] != 1) {
                                arr[py][px] = 1;
                                q.offer(new int[]{py, px});
                                land++;
                            }
                        }
                    }
                }
                qr.offer(land);
            }
        }
        for (int i = 0; i < rst; i++) {
            sb.append(qr.poll()).append(" ");
        }
        System.out.println(rst);
        System.out.println(sb);
        br.close();
    }
}

