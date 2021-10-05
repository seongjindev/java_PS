package dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A11060 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        dp[0] = 1;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j]+j >= i && dp[j]!=0) {
                    if (dp[i] == 0) {
                        dp[i] = dp[j] + 1;
                    }else {
                        dp[i] = Math.min(dp[i], dp[j]+1);
                    }
                }
            }
        }
        if (dp[n-1] > 0) {
            System.out.println(dp[n-1]-1);
        }else {
            System.out.println(-1);
        }
        br.close();
    }
}
