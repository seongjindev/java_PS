package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class A12761 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] stone = new int[100001];
        boolean[] chk = new boolean[100001];
        Queue<Integer> q = new LinkedList<>();
        q.offer(n);
        chk[n] = true;
        while (!q.isEmpty()) {
            Integer poll = q.poll();
            if (poll==m) {
                break;
            }
            int[] move = {poll+1, poll-1, poll+a, poll-a, poll+b, poll-b, poll*a, poll*b, poll-(poll*a), poll-(poll*b)};
            for (int i = 0; i < 10; i++) {
                if (move[i] >= 0 && move[i] <= 100000 && !chk[move[i]]) {
                    chk[move[i]] = true;
                    q.offer(move[i]);
                    stone[move[i]] = stone[poll] + 1;
                }
            }
        }
        System.out.println(stone[m]);
        br.close();
    }
}
