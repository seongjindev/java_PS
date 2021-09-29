package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A1052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int cnt = 0;
        int bo = 0;
        String bn = Integer.toBinaryString(n);
        for (int i = 0; i < bn.length(); i++) {
            if (bn.charAt(i)=='1') {
                cnt++;
            }
        }
        if (cnt > k) {
            while (true) {
                cnt = 0;
                bo++;
                n++;
                bn = Integer.toBinaryString(n);
                for (int i = 0; i < bn.length(); i++) {
                    if (bn.charAt(i)=='1') {
                        cnt++;
                    }
                }
                if (cnt<=k) {
                    break;
                }
            }
        }
        System.out.println(bo);
        br.close();
    }
}
