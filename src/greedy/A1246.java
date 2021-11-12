package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class A1246 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Integer[] arr = new Integer[m];
        for (int i = 0; i < m; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr, Collections.reverseOrder());
        int max = 0;
        int min = Math.min(n, m);
        int price = 0;
        for (int i = 0; i < min; i++) {
            if (max < arr[i] * (i+1)) {
                max = arr[i] * (i+1);
                price = arr[i];
            }
        }
        System.out.println(price + " " + max);
        br.close();
    }
}
