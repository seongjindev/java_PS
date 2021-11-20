package dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A15881 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String ns = br.readLine();
        int cnt = 0;
        for (int i = 0; i < n-3; i++) {
            if (ns.charAt(i) == 'p' && ns.charAt(i+1) == 'P' && ns.charAt(i+2) == 'A' && ns.charAt(i+3) == 'p') {
                i += 3;
                cnt++;
            }
        }
        System.out.println(cnt);
        br.close();
    }
}