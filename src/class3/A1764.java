package class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class A1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Queue<String> q = new PriorityQueue<>();
        for (int i = 0; i < n+m; i++) {
            q.offer(br.readLine());
        }
        String chk = q.poll();
        int sum = 0;
        for (int i = 1; i < n+m; i++) {
            String poll = q.poll();
            if (chk.equals(poll)) {
                sum++;
                sb.append(poll).append("\n");
            }
            chk = poll;
        }
        System.out.println(sum);
        System.out.println(sb);
        br.close();
    }
}
