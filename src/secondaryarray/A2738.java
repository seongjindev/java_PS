package secondaryarray;

import java.io.*;
import java.util.StringTokenizer;

public class A2738 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] matrix = new int[n*2][m];
        for (int i = 0; i < n*2; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                matrix[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                bw.write(matrix[i+n][j] + matrix[i][j]+ " ");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
