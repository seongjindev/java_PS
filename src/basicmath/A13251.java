package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A13251 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int[] c = new int[m];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum = 0;
        for (int i = 0; i < m; i++) {
            c[i] = Integer.parseInt(st.nextToken());
            sum += c[i];
        }
        int k = Integer.parseInt(br.readLine());
        double rst = 0;
        for (int i = 0; i < m; i++) {
            double mul = 1.0;
            for (int j = 0; j < k; j++) {
                mul *= (double) (c[i] - j) / (sum - j);
            }
            rst += mul;
        }
        System.out.println(rst);
        br.close();
    }
}
