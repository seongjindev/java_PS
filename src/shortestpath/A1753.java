package shortestpath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class ShortVW implements Comparable<ShortVW> {
    int v, w;

    public ShortVW(int v, int w) {
        this.v = v;
        this.w = w;
    }

    @Override
    public int compareTo(ShortVW o) {
        return w - o.w;
    }
}

public class A1753 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int v = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(br.readLine());
        ArrayList<ShortVW>[] ard = new ArrayList[v+1];
        for(int i = 1; i <= v; i++) {
            ard[i] = new ArrayList<>();
        }
        for (int i = 1; i <= e; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st2.nextToken());
            int b = Integer.parseInt(st2.nextToken());
            int c = Integer.parseInt(st2.nextToken());
            ard[a].add(new ShortVW(b, c));
        }

        int[] ld = new int[v+1];
        Arrays.fill(ld, Integer.MAX_VALUE);
        PriorityQueue<ShortVW> q = new PriorityQueue<>();
        q.offer(new ShortVW(k, 0));
        ld[k] = 0;
        while(!q.isEmpty()) {
            ShortVW p = q.poll();

            int ver = p.v;
            int wei = p.w;
            if(ld[ver] < wei) {
                continue;
            }
            for(int i = 0; i < ard[ver].size(); i++) {
                int ver2 = ard[ver].get(i).v;
                int wei2 = ard[ver].get(i).w + wei;
                if(ld[ver2] > wei2) {
                    ld[ver2] = wei2;
                    q.add(new ShortVW(ver2, wei2));
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
        br.close();
    }
}
