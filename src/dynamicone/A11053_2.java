package dynamicone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A11053_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ln = Integer.parseInt(br.readLine());
        int[] box = new int[ln];
        int[] dp = new int[ln];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < ln; i++) {
            box[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < ln; i++) {
            dp[i] = 1;
            for(int j = 0; j < i; j++) {
                if(box[j] < box[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        int max = 0;
        for(int i = 0; i < ln; i++) {
            max = Math.max(dp[i], max);
        }
        System.out.println(max);
        br.close();
    }
}
