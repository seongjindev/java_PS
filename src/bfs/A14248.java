package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class A14248 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dx = {1, -1};
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n+1];
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int fir = Integer.parseInt(br.readLine());
        boolean[] chk = new boolean[n+1];
        Queue<Integer> q = new LinkedList<>();
        q.offer(fir);
        chk[fir] = true;
        int cnt = 1;
        while (!q.isEmpty()) {
            Integer poll = q.poll();
            for (int i = 0; i < 2; i++) {
                int a = poll + (dx[i] * arr[poll]);
                if (a > 0 && a <= n && !chk[a]) {
                    chk[a] = true;
                    q.offer(a);
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
        br.close();
    }
}
