package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A26090 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int aSum = n + 1;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            aSum += arr[i];
        }
        boolean[] pn = new boolean[aSum];
        for (int i = 2; i < aSum; i++) {
            if (!pn[i]) {
                for (int j = 2; j < aSum; j++) {
                    if (i * j >= aSum) {
                        break;
                    }
                    pn[i * j] = true;
                }
            }
        }
        pn[0] = true;
        pn[1] = true;
        int cnt = 0;
        for (int i = 2; i <= n; i++) {
            if (pn[i]) continue;
            for (int a = 0; a <= n - i; a++) {
                int sum = 0;
                for (int b = a; b < a + i; b++) {
                    sum += arr[b];
                }
                if (!pn[sum]) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
        br.close();
    }
}
