package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class posA1388 {
    int x, y;
    public posA1388(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class A1388 {
    static String[] arr;
    static boolean[][] chk;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Queue<posA1388> q = new LinkedList<>();
        arr = new String[n];
        chk = new boolean[n][m];
        for(int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }

        int sum = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(!chk[i][j]) {
                    q.offer(new posA1388(i,j));
                    sum++;
                    char c = arr[i].charAt(j);
                    while (!(q.isEmpty())) {
                        posA1388 p = q.poll();
                        if(arr[p.x].charAt(p.y)=='|' && arr[p.x].charAt(p.y)==c){
                            chk[p.x][p.y] = true;
                            if(p.x<n-1){
                                q.offer(new posA1388(p.x+1, p.y));
                            }
                        }
                        if(arr[p.x].charAt(p.y)=='-' && arr[p.x].charAt(p.y)==c){
                            chk[p.x][p.y] = true;
                            if(p.y<m-1){
                                q.offer(new posA1388(p.x, p.y+1));
                            }
                        }
                    }
                }
            }
        }
        System.out.println(sum);
        br.close();
    }
}
