package basicmath;

import java.io.*;

public class A2775 {
    public static void main(String[] args) throws IOException {
        //0 0 0
        //0 0 0
        //1 2 3
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = Integer.parseInt(br.readLine());
        int[][] h = new int[15][15];
        for(int i = 1; i < 15; i++) {
            h[0][i] = i;
            h[i][1] = 1;
        }
        for(int i = 1; i < 15; i++) {
            for(int j = 2; j < 15; j++) {
                h[i][j] = h[i][j-1] + h[i-1][j];
            }
        }
        for(int i = 0; i < cnt; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            bw.write(h[k][n] + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
