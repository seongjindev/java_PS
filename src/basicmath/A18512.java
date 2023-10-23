package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A18512 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int p1 = Integer.parseInt(st.nextToken());
        int p2 = Integer.parseInt(st.nextToken());
        int rst = p1;
        int cnt = 0;
        while (p1 != p2) {
            if (p1 < p2) {
                p1 += x;
            } else {
                p2 += y;
            }
            cnt++;
            if (cnt == 10000) {
                rst = -1;
                break;
            }
            rst = p1;
        }
        System.out.println(rst);
        br.close();
    }
}
