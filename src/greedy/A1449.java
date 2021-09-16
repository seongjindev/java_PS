package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A1449 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        int[] wt = new int[n];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            wt[i] = Integer.parseInt(st2.nextToken());
        }
        Arrays.sort(wt);
        int cnt = 0;
        int seq = 0;
        int suc = 0;
        while (true) {
            int i = wt[seq];
            if (i > suc) {
                cnt++;
                suc =i+l-1;
            }
            seq++;
            if (seq == n) {
                break;
            }
        }
        System.out.println(cnt);
        br.close();
    }
}
