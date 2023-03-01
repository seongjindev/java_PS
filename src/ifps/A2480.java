package ifps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int rst;
        if (a==b && b==c) {
            rst = 10000 + (a * 1000);
        } else if (a==b || a==c) {
            rst = 1000 + (a * 100);
        } else if (b==c) {
            rst = 1000 + (b * 100);
        } else {
            rst = Math.max(Math.max(a, b), c) * 100;
        }
        System.out.println(rst);
    }
}
