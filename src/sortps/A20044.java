package sortps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A20044 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n * 2];
        for (int i = 0; i < n * 2; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int min = 200000;
        for (int i = 0; i < n; i++) {
            min = Math.min(min, arr[i] + arr[arr.length - 1 - i]);
        }
        System.out.println(min);
        br.close();
    }
}
