package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A1434 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] na = new int[n];
        int[] ma = new int[m];
        int ns = 0;
        int ms = 0;
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            na[i] = Integer.parseInt(st2.nextToken());
            ns += na[i];
        }
        StringTokenizer st3 = new StringTokenizer(br.readLine());
        for(int i = 0; i < m; i++) {
            ma[i] = Integer.parseInt(st3.nextToken());
            ms += ma[i];
        }
        System.out.println(ns-ms);
        br.close();
    }
}
