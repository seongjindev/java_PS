package dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A2491 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        int[] adp = new int[n];
        int[] ddp = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        adp[0] = 1;
        ddp[0] = 1;
        for (int i = 1; i < n; i++) {
            adp[i] = 1;
            ddp[i] = 1;
            if (arr[i] >= arr[i-1]) {
                adp[i] = Math.max(adp[i], adp[i-1] + 1);
            }
            if (arr[i] <= arr[i-1]) {
                ddp[i] = Math.max(ddp[i], ddp[i-1] + 1);
            }
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, Math.max(adp[i], ddp[i]));
        }
        System.out.println(max);
        br.close();
    }
}
