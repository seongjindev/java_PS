package tree;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.StringTokenizer;
//
////메모리 초과
//public class A11725 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int cnt = Integer.parseInt(br.readLine());
//        boolean[][] nd = new boolean[cnt+1][cnt+1];
//        boolean[] chk = new boolean[cnt+1];
//        for(int i = 1; i < cnt; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            int a = Integer.parseInt(st.nextToken());
//            int b = Integer.parseInt(st.nextToken());
//            nd[a][b] = true;
//            nd[b][a] = true;
//        }
//        int[] parent = new int[cnt+1];
//        Queue<Integer> q = new LinkedList<>();
//        q.offer(1);
//        while (!(q.isEmpty())) {
//            Integer p = q.poll();
//
//            for(int j = 1; j <= cnt; j++) {
//                if(nd[p][j] == true && chk[j]== false) {
//                    chk[j] = true;
//                    q.offer(j);
//                    parent[j] = p;
//                }
//            }
//        }
//        for(int i = 2; i <= cnt; i++) {
//            System.out.println(parent[i]);
//        }
//        br.close();
//    }
//}


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class A11725 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        ArrayList<Integer>[] g = new ArrayList[cnt+1];
        for(int i = 1; i <= cnt; i++) {
            g[i] = new ArrayList<>();
        }
        boolean[] chk = new boolean[cnt+1];
        for(int i = 1; i < cnt; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            g[a].add(b);
            g[b].add(a);
        }
        int[] parent = new int[cnt+1];
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        chk[1] = true;
        while (!(q.isEmpty())) {
            Integer p = q.poll();
            for(int v : g[p]) {
                if(chk[v]==false) {
                    chk[v] = true;
                    q.offer(v);
                    parent[v] = p;
                }
            }
        }
        for(int i = 2; i <= cnt; i++) {
            System.out.println(parent[i]);
        }
        br.close();
    }
}