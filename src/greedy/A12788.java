package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class A12788 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        Integer[] arr = new Integer[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr, Collections.reverseOrder());
        int sum = 0;
        int cnt = 1;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum >= m * k) {
                break;
            }
            cnt++;
            if (i == n - 1) {
                cnt = 0;
            }
        }
        System.out.println(cnt==0 ? "STRESS" : cnt);
        br.close();
    }
}
