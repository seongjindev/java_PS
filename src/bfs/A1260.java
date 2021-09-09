package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class A1260 {
    static boolean[] chk;
    static boolean[][] arr;
    static StringBuilder sb;
    static void dfs(int n, int v) {
        chk[v] = true;
        sb.append(v + " ");

        for (int i = 1; i <= n; i++) {
            if(arr[v][i]==true && chk[i] == false) {
                dfs(n, i);
            }
        }
    }

    static void bfs(int n, int v) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(v);
        chk[v] = true;

        while (!(q.isEmpty())) {
            Integer poll = q.poll();
            sb.append(poll + " ");
            for (int i = 1; i <= n; i++) {
                if(arr[poll][i] == true && chk[i] ==false) {
                    q.offer(i);
                    chk[i] = true;
                }
            }
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
        arr = new boolean[n+1][n+1];
        chk = new boolean[n+1];
        sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st2.nextToken());
            int b = Integer.parseInt(st2.nextToken());
            arr[a][b] = true;
            arr[b][a] = true;
        }
        dfs(n, v);
        Arrays.fill(chk, false);
        sb.append("\n");
        bfs(n, v);
        System.out.println(sb);
        br.close();

    }
}
