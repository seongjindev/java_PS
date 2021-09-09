package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class A2644 {
    static int n, a, b, m, rst;
    static boolean[][] nd;
    static boolean[] chk;
    static void dfs(int v, int cnt) {
        if(v==b) {
            rst = cnt;
            return;
        }
        for(int i = 1; i <= n; i++) {
            if(nd[v][i]==true && chk[i]==false) {
                chk[i] = true;
                dfs(i, cnt+1);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(br.readLine());
        nd = new boolean[n+1][n+1];
        chk = new boolean[n+1];
        for(int i = 0; i < m; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st2.nextToken());
            int y = Integer.parseInt(st2.nextToken());
            nd[x][y] = true;
            nd[y][x] = true;
        }
        int cnt =0;
        chk[a] = true;
        dfs(a, cnt);
        if(chk[b]){
            System.out.println(rst);
        }else {
            System.out.println(-1);
        }
        br.close();
    }
}