package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A9550 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int sum = 0;
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                sum += Integer.parseInt(st.nextToken()) / k;
            }
            sb.append(sum).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}
