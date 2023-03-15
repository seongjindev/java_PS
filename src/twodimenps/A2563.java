package twodimenps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] paper = new int[100][100];
        int cnt = 0;
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int wid = Integer.parseInt(st.nextToken());
            int ver = Integer.parseInt(st.nextToken());
            for (int a = wid; a < wid+10; a++) {
                for (int b = ver; b < ver+10; b++) {
                    if (paper[a][b] == 0) {
                        paper[a][b] = 1;
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
        br.close();
    }
}
