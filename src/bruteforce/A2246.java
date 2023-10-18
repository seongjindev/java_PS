package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A2246 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] cd = new int[n][2];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            cd[i][0] = Integer.parseInt(st.nextToken());
            cd[i][1] = Integer.parseInt(st.nextToken());
        }
        int rst = 0;
        for (int i = 0; i < n; i++) {
            boolean ck = true;
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }
                if (cd[i][0] >= cd[j][0]) {
                    if (cd[i][1] >= cd[j][1]) {
                        ck = false;
                        continue;
                    }
                }
                if (cd[i][1] >= cd[j][1]) {
                    if (cd[i][0] >= cd[j][0]) {
                        ck = false;
                    }
                }
            }
            if (ck) {
                rst++;
            }
        }
        System.out.println(rst);
        br.close();
    }
}