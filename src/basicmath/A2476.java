package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A2476 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int rst = 0;
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int sum;
            if (a == b && b == c) {
                sum = 10000 + (a * 1000);
            } else if (a != b && b != c && a != c) {
                sum = Math.max(Math.max(a, b), c) * 100;
            } else {
                if (a == b || a == c) {
                    sum = 1000 + (a * 100);
                } else {
                    sum = 1000 + (b * 100);
                }
            }
            rst = Math.max(rst, sum);
        }
        System.out.println(rst);
        br.close();
    }
}
