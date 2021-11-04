package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class A1389 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        boolean[][] nd = new boolean[n+1][n+1];
        int[] chk = new int[n+1];
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            nd[a][b] = true;
            nd[b][a] = true;
        }
        int deep = Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 1; i <= n; i++) {
            Arrays.fill(chk, 0);
            chk[i] = 1;
            Queue<Integer> q = new LinkedList<>();
            q.offer(i);
            int minChk = Integer.MAX_VALUE;
            while (!q.isEmpty()) {
                Integer poll = q.poll();
                for (int a = 1; a <= n; a++) {
                    if (nd[poll][a] && chk[a]==0) {
                        chk[a] = chk[poll] + 1;
                        q.offer(a);
                    }
                }
            }
            int sum = 0;
            for (int c = 1; c <= n; c++) {
                sum += chk[c];
            }
            minChk = Math.min(minChk, sum);
            if (minChk < deep) {
                deep = minChk;
                min = i;
            }
        }
        System.out.println(min);
        br.close();
    }
}
