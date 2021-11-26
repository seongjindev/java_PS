package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A14720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int[] milk = {0, 1, 2};
        int fir = 0;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (milk[fir] == arr[i]) {
                cnt++;
                if (fir == 2) {
                    fir = 0;
                }else {
                    fir++;
                }
            }
        }
        System.out.println(cnt);
        br.close();
    }
}
