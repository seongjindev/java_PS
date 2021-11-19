package bfs;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.StringTokenizer;
//
//public class A17086 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int[] dx = {1, 1, 0, -1, -1, -1, 0, 1};
//        int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
//        int n = Integer.parseInt(st.nextToken());
//        int m = Integer.parseInt(st.nextToken());
//        int[][] arr = new int[n][m];
//        for (int i = 0; i < n; i++) {
//            st = new StringTokenizer(br.readLine());
//            for (int j = 0; j < m; j++) {
//                arr[i][j] = Integer.parseInt(st.nextToken());
//            }
//        }
//        int max = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                if (arr[i][j] != 0) {
//                    continue;
//                }
//                boolean[][] chk = new boolean[n][m];
//                Queue<int[]> q = new LinkedList<>();
//                q.offer(new int[]{i, j});
//                chk[i][j] = true;
//                int sum = 0;
//                int[][] cnt = new int[n][m];
//                while (!q.isEmpty()) {
//                    int[] poll = q.poll();
//                    for (int a = 0; a < 8; a++) {
//                        int x = poll[1] + dx[a];
//                        int y = poll[0] + dy[a];
//                        if (x >= 0 && x < m && y >= 0 && y < n) {
//                            if (!chk[y][x] && arr[y][x] == 0) {
//                                cnt[y][x] = cnt[poll[0]][poll[1]] + 1;
//                                chk[y][x] = true;
//                                q.offer(new int[]{y, x});
//                            } else if (!chk[y][x] && arr[y][x] == 1) {
//                                sum = cnt[poll[0]][poll[1]] + 1;
//                                break;
//                            }
//                        }
//                    }
//                    if (sum > 0) {
//                        break;
//                    }
//                }
//                max = Math.max(max, sum);
//            }
//        }
//        System.out.println(max);
//        br.close();
//    }
//}

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.StringTokenizer;
//
//public class A17086 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int[] dx = {1, 1, 0, -1, -1, -1, 0, 1};
//        int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
//        int n = Integer.parseInt(st.nextToken());
//        int m = Integer.parseInt(st.nextToken());
//        int[][] arr = new int[n][m];
//        for (int i = 0; i < n; i++) {
//            st = new StringTokenizer(br.readLine());
//            for (int j = 0; j < m; j++) {
//                arr[i][j] = Integer.parseInt(st.nextToken());
//            }
//        }
//        int max = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                if (arr[i][j] == 1) {
//                    continue;
//                }
//                boolean[][] chk = new boolean[n][m];
//                Queue<int[]> q = new LinkedList<>();
//                q.offer(new int[]{i, j});
//                chk[i][j] = true;
//                int sum = 0;
//                int[][] cnt = new int[n][m];
//                while (!q.isEmpty()) {
//                    int[] poll = q.poll();
//                    for (int a = 0; a < 8; a++) {
//                        int x = poll[1] + dx[a];
//                        int y = poll[0] + dy[a];
//                        if (x >= 0 && x < m && y >= 0 && y < n) {
//                            if (!chk[y][x] && arr[y][x] == 0) {
//                                cnt[y][x] = cnt[poll[0]][poll[1]] + 1;
//                                chk[y][x] = true;
//                                q.offer(new int[]{y, x});
//                            } else if (!chk[y][x] && arr[y][x] == 1) {
//                                sum = cnt[poll[0]][poll[1]] + 1;
//                                break;
//                            }
//                        }
//                    }
//                    if (sum > 0) {
//                        break;
//                    }
//                }
//                max = Math.max(max, sum);
//            }
//        }
//        System.out.println(max);
//        br.close();
//    }
//}

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.StringTokenizer;
//
//public class A17086 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int[] dx = {1, 1, 0, -1, -1, -1, 0, 1};
//        int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
//        int n = Integer.parseInt(st.nextToken());
//        int m = Integer.parseInt(st.nextToken());
//        int[][] arr = new int[n][m];
//        for (int i = 0; i < n; i++) {
//            st = new StringTokenizer(br.readLine());
//            for (int j = 0; j < m; j++) {
//                arr[i][j] = Integer.parseInt(st.nextToken());
//            }
//        }
//        int max = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                if (arr[i][j] == 1) {
//                    continue;
//                }
//                boolean[][] chk = new boolean[n][m];
//                Queue<Node> q = new LinkedList<>();
//                q.offer(new Node(i, j));
//                chk[i][j] = true;
//                int sum = 0;
//                int[][] cnt = new int[n][m];
//                while (!q.isEmpty()) {
//                    Node poll = q.poll();
//                    for (int a = 0; a < 8; a++) {
//                        int x = poll.x + dx[a];
//                        int y = poll.y + dy[a];
//                        if (x >= 0 && x < m && y >= 0 && y < n) {
//                            if (!chk[y][x] && arr[y][x] == 0) {
//                                cnt[y][x] = cnt[poll.y][poll.x] + 1;
//                                chk[y][x] = true;
//                                q.offer(new Node(y, x));
//                            } else if (!chk[y][x] && arr[y][x] == 1) {
//                                sum = cnt[poll.y][poll.x] + 1;
//                                break;
//                            }
//                        }
//                    }
//                    if (sum > 0) {
//                        break;
//                    }
//                }
//                max = Math.max(max, sum);
//            }
//        }
//        System.out.println(max);
//        br.close();
//    }
//}
//
//class Node {
//    int y, x;
//
//    public Node(int y, int x) {
//        this.y = y;
//        this.x = x;
//    }
//}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class A17086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] dx = {1, 1, 0, -1, -1, -1, 0, 1};
        int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][m];
        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = n*m;
                if (Integer.parseInt(st.nextToken()) == 1) {
                    q.offer(new int[]{i, j});
                    arr[i][j] = 0;
                }
            }
        }
        int max = 0;
        while (!q.isEmpty()) {
            int[] poll = q.poll();
            for (int a = 0; a < 8; a++) {
                int x = poll[1] + dx[a];
                int y = poll[0] + dy[a];
                if (x >= 0 && x < m && y >= 0 && y < n) {
                    if (arr[poll[0]][poll[1]] + 1 < arr[y][x]) {
                        arr[y][x] = arr[poll[0]][poll[1]] + 1;
                        q.offer(new int[]{y, x});
                        max = Math.max(max, arr[y][x]);
                    }
                }
            }
        }
        System.out.println(max);
        br.close();
    }
}