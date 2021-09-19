package dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A6395 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        long[][] arr = new long[31][31];
        arr[1][1] = 1;
        for (int i = 2; i < 31; i++) {
            for (int j = 1; j <= i; j++) {
                arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
            }
        }
        System.out.println(arr[n][k]);
        br.close();
    }
}
