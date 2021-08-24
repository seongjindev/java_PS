package dynamicone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A11054 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int[] nums = new int[cnt];
        int[][] bp = new int[cnt][2];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < cnt; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
            bp[i][0] = 1;
            bp[i][1] = 1;
        }
        for(int i = 0; i < cnt; i++) {
            for(int j = 0; j < i; j++) {
                if(nums[j]<nums[i] && bp[i][0] < bp[j][0] + 1) {
                    bp[i][0] = bp[j][0] + 1;
                }
            }
        }
        for(int i = cnt-1; i >=0 ; i--) {
            for(int j = cnt-1; j > i; j--) {
                if(nums[j]<nums[i] && bp[i][1] < bp[j][1] + 1) {
                    bp[i][1] = bp[j][1] + 1;
                }
            }
        }
        int max = 0;
        for(int i = 0; i < cnt; i++) {
            if(max<bp[i][0]+bp[i][1]) {
                max = bp[i][0]+bp[i][1] - 1;
            }
        }
        System.out.println(max);
    }
}
