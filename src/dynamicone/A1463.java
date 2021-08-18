package dynamicone;

import java.io.*;

public class A1463 {
    static Integer[] dp;

    static int re(int num) {
        if(dp[num] == null) {
            if(num%6==0) {
                dp[num] = Math.min(re(num-1), Math.min(re(num/2), re(num/3))) + 1;
            }else if(num%3==0) {
                dp[num] = Math.min(re(num/3), re(num-1)) + 1;
            }else if(num%2==0) {
                dp[num] = Math.min(re(num/2), re(num-1)) + 1;
            }else {
                dp[num] = re(num-1) + 1;
            }
        }
        return dp[num];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        dp = new Integer[num+1];
        dp[0] = 0;
        dp[1] = 0;
        System.out.println(re(num));
    }
}
