package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A5585 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 1000 - Integer.parseInt(br.readLine());
        int[] m = {500, 100, 50, 10, 5, 1};
        int cnt = 0;
        for(int i = 0; i < 6; i++) {
            if(n >= m[i]) {
                cnt += n/m[i];
                n %= m[i];
            }
        }
        System.out.println(cnt);
        br.close();
    }
}
