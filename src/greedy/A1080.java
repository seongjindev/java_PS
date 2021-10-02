package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A1080 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] nm1 = new int[n][m];
        int[][] nm2 = new int[n][m];
        for (int i = 0; i < n; i++) {
            String a = br.readLine();
            for (int j = 0; j < m; j++) {
                nm1[i][j] = a.charAt(j)-'0';
            }
        }
        for (int i = 0; i < n; i++) {
            String a = br.readLine();
            for (int j = 0; j < m; j++) {
                nm2[i][j] = a.charAt(j)-'0';
            }
        }
        int rst = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (nm1[i][j]!=nm2[i][j]) {
                    if (j+2>=m || i+2>=n) {
                        rst = -1;
                        break;
                    }
                    for (int a = i; a < i+3; a++) {
                        for (int b = j; b < j+3; b++) {
                            if (nm1[a][b]==1) {
                                nm1[a][b] = 0;
                            }else {
                                nm1[a][b] = 1;
                            }
                        }
                    }
                    rst++;
                }
            }
            if (rst == -1) {
                break;
            }
        }
        System.out.println(rst);
        br.close();
    }
}
