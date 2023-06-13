package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A25632 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        boolean[] pn = new boolean[1001];
        for (int i = 2; i <= 1000; i++) {
            if (!pn[i]) {
                for (int j = 2; j <= 1000; j++) {
                    if (i * j > 1000) {
                        break;
                    }
                    pn[i * j] = true;
                }
            }
        }
        if (d > b) {
            while (true) {
                boolean ytck = false;
                boolean yjck = false;
                for (int i = b; i >= a; i--) {
                    if (!pn[i]) {
                        pn[i] = true;
                        ytck = true;
                        b = i;
                        break;
                    }
                }
                if (!ytck) {
                    System.out.println("yj");
                    break;
                }
                for (int j = c; j <= d; j++) {
                    if (!pn[j]) {
                        pn[j] = true;
                        yjck = true;
                        c = j;
                        break;
                    }
                }
                if (!yjck) {
                    System.out.println("yt");
                    break;
                }
            }
        } else {
            while (true) {
                boolean ytck = false;
                boolean yjck = false;
                for (int i = a; i <= b; i++) {
                    if (!pn[i]) {
                        pn[i] = true;
                        ytck = true;
                        a = i;
                        break;
                    }
                }
                if (!ytck) {
                    System.out.println("yj");
                    break;
                }
                for (int j = d; j >= c; j--) {
                    if (!pn[j]) {
                        pn[j] = true;
                        yjck = true;
                        d = j;
                        break;
                    }
                }
                if (!yjck) {
                    System.out.println("yt");
                    break;
                }
            }
        }
        br.close();
    }
}