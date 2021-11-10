package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class A1326 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n+1];
        int[] dx = {1, -1};
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[] chk = new int[n+1];
        boolean[] chk2 = new boolean[n+1];
        Queue<Integer> q = new LinkedList<>();
        q.offer(a);
        chk[a] = 1;
        chk2[a] = true;
        while (!q.isEmpty()) {
            Integer poll = q.poll();
            if (poll==b) {
                break;
            }
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j < 2; j++) {
                    int jump = (arr[poll] * i * dx[j]) + poll;
                    if (jump <= n && jump > 0 && !chk2[jump]) {
                        chk2[jump] = true;
                        chk[jump] = chk[poll] + 1;
                        q.offer(jump);
                    }
                }
            }
        }
        System.out.println(chk[b]-1);
        br.close();
    }
}
