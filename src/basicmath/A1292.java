package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A1292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int cnt = 0;
        int sum = 0;
        Loop1 :
        for (int i = 1; i < 1000; i++) {
            for (int j = 1; j <= i; j++) {
                cnt++;
                if (a <= cnt && b >= cnt) {
                    sum += i;
                }
                if (b < cnt) {
                    break Loop1;
                }
            }
        }
        System.out.println(sum);
        br.close();
    }
}
