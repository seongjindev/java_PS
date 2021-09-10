package shortestpath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class A1753 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int v = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(br.readLine());
        int[][] nd = new int[v+1][v+1];
        ArrayList<Integer>[] ard = new ArrayList[v+1];
        for(int i = 1; i <= v; i++) {
            ard[i] = new ArrayList<>();
        }
        for (int i = 1; i <= e; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st2.nextToken());
            int b = Integer.parseInt(st2.nextToken());
            int c = Integer.parseInt(st2.nextToken());
            nd[a][b] = c;
            ard[a].add(b);
        }
        int[] ld = new int[v+1];
        Arrays.fill(ld, Integer.MAX_VALUE);
        Queue<Integer> q = new LinkedList<>();
        q.offer(k);
        ld[k] = 0;
        int sum = 0;
        while (!(q.isEmpty())) {
            Integer p = q.poll();
            sum++;
            for(int g : ard[p]) {
                if(ld[g] > nd[p][g] + ld[p]) {
                    q.offer(g);
                    ld[g] = Math.min(nd[p][g] + ld[p], ld[g]);
                }
            }
        }
        for(int i = 1; i <= v; i++) {
            if(ld[i]==Integer.MAX_VALUE) {
                System.out.println("INF");
            }else {
                System.out.println(ld[i]);
            }
        }
        System.out.println("---");
        System.out.println(sum);
        br.close();
    }
}
