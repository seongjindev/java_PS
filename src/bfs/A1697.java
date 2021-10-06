package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class A1697 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        boolean[] chk = new boolean[100001];
        int[] snd = new int[100001];
        Queue<Integer> q = new LinkedList<>();
        q.offer(n);
        chk[n] = true;
        while (!q.isEmpty()) {
            Integer poll = q.poll();
            if (poll==k) {
                break;
            }
            int[] pos = {poll+1, poll-1, poll*2, poll-(poll*2)};
            for (int i = 0; i < 4; i++) {
                if (pos[i] >= 0 && pos[i] <= 100000 && !chk[pos[i]]) {
                    chk[pos[i]] = true;
                    q.offer(pos[i]);
                    snd[pos[i]] = snd[poll] + 1;
                }
            }
        }
        System.out.println(snd[k]);
        br.close();
    }
}
