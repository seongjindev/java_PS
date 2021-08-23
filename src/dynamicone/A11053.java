package dynamicone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A11053 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int[] nums = new int[cnt];
        int[] dp = new int[cnt];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < cnt; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
            dp[i] = 1;
        }
        for(int i = 0; i < cnt; i++) {
            for(int j = 0; j < i; j++) {
                if(nums[j]<nums[i] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                }
            }
        }
        int max = 0;
        for(int i = 0; i < cnt; i++) {
            if(max<dp[i]) {
                max = dp[i];
            }
        }
        System.out.println(max);
        br.close();
    }
}

