package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A1812 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] cd = new int[n];
        for (int i = 0; i < n; i++) {
            cd[i] = Integer.parseInt(br.readLine());
        }
        int[] rst = new int[n];
        for (int i = 1; i <= cd[0]; i++) {
            rst[0] = i;
            for (int j = 1; j < n; j++) {
                rst[j] = cd[j - 1] - rst[j - 1];
                if (rst[j] < 0) {
                    break;
                }
            }
            if (rst[0] + rst[n - 1] == cd[n - 1]) {
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(rst[i]);
        }
        br.close();
    }
}
