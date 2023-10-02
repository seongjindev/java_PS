package stringps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A11383 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String[] be = new String[n];
        String[] af = new String[n];
        for (int i = 0; i < n; i++) {
            be[i] = br.readLine();
        }
        for (int i = 0; i < n; i++) {
            af[i] = br.readLine();
        }
        String rst = "Eyfa";
        loop:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (be[i].charAt(j) != af[i].charAt(j * 2) || be[i].charAt(j) != af[i].charAt((j * 2) + 1)) {
                    rst = "Not Eyfa";
                    break loop;
                }
            }
        }
        System.out.println(rst);
        br.close();
    }
}
