package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A12845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] an = new int[n];
        int max = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            an[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, an[i]);
        }
        int rst = 0;
        for (int i = 0; i < n; i++) {
            rst += an[i] + max;
        }
        rst -= max+max;
        System.out.println(rst);
        br.close();
    }
}
