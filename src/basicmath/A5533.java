package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A5533 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] game = new int[n][3];
        int[] rst = new int[n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            game[i][0] = Integer.parseInt(st.nextToken());
            game[i][1] = Integer.parseInt(st.nextToken());
            game[i][2] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                boolean point = true;
                for (int k = 0; k < n; k++) {
                    if (i == k) {
                        continue;
                    }
                    if (game[i][j] == game[k][j]) {
                        point = false;
                        break;
                    }
                }
                if (point) {
                    rst[i] += game[i][j];
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(rst[i]);
        }
    }
}
