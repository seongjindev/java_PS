package dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A19947 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int[] dp = new int[y+1];
        dp[0] = h;
        for (int i = 1; i <= y; i++) {
            dp[i] = (int)(dp[i - 1] * 1.05);
            if (i >= 3) {
                dp[i] = Math.max((int)(dp[i - 3] * 1.20), dp[i]);
            }
            if (i >= 5) {
                dp[i] = Math.max((int)(dp[i - 5] * 1.35), dp[i]);
            }
        }
        System.out.println(Math.max(dp[y], Math.max(dp[y], dp[y])));
        br.close();
    }
}
