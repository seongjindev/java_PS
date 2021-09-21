package bfs;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.StringTokenizer;
//
//public class A1012 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int tc = Integer.parseInt(br.readLine());
//        StringBuilder sb = new StringBuilder();
//        int[] dx = {1, 0, -1, 0};
//        int[] dy = {0, 1, 0, -1};
//        for(int i = 0; i < tc; i++) {
//            int cnt = 0;
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            int m = Integer.parseInt(st.nextToken());
//            int n = Integer.parseInt(st.nextToken());
//            int k = Integer.parseInt(st.nextToken());
//            boolean[][] nd = new boolean[m][n];
//            boolean[][] chk = new boolean[m][n];
//            for(int j = 0; j < k; j++) {
//                StringTokenizer st2 = new StringTokenizer(br.readLine());
//                int a = Integer.parseInt(st2.nextToken());
//                int b = Integer.parseInt(st2.nextToken());
//                nd[a][b] = true;
//            }
//            for (int z = 0; z < m; z++) {
//                for(int x = 0; x < n; x++) {
//                    if(nd[z][x]==true && chk[z][x] == false) {
//                        Queue<int[]> q = new LinkedList<>();
//                        q.offer(new int[] {z, x});
//
//                        while (!(q.isEmpty())) {
//                            int[] p = q.poll();
//                            for (int c = 0; c < 4; c++) {
//                                int cx = dx[c] + p[0];
//                                int cy = dy[c] + p[1];
//
//                                if(cx >=0 && cy >= 0 && cx < m && cy < n) {
//                                    if(chk[cx][cy]==false && nd[cx][cy]==true){
//                                        q.offer(new int[] {cx, cy});
//                                        chk[cx][cy] = true;
//                                    }
//                                }
//                            }
//                        }
//                        cnt++;
//                    }
//                }
//            }
//            sb.append(cnt + "\n");
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class A1012 {
    static boolean[][] nd;
    static boolean[][] chk;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int m, n, k;

    static void bfs(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] {x, y});

        while (!(q.isEmpty())) {
            int[] p = q.poll();
            for(int i = 0; i < 4; i++) {
                int px = p[0] + dx[i];
                int py = p[1] + dy[i];
                if(px >= 0 && px < m && py >= 0 && py < n) {
                    if(nd[px][py]==true && chk[px][py]==false) {
                        q.offer(new int[] {px, py});
                        chk[px][py] = true;
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < tc; i++) {
            int cnt = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());
            nd = new boolean[m][n];
            chk = new boolean[m][n];
            for(int j = 0; j < k; j++) {
                StringTokenizer st2 = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st2.nextToken());
                int b = Integer.parseInt(st2.nextToken());
                nd[a][b] = true;
            }
            for(int a = 0; a < m; a++) {
                for(int b = 0; b < n; b++) {
                    if(nd[a][b] == true && chk[a][b] == false) {
                        bfs(a,b);
                        cnt++;
                    }
                }
            }
            sb.append(cnt + "\n");
        }
        System.out.println(sb);
    }
}














