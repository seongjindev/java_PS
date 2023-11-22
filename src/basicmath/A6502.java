package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A6502 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = 1;
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            if (r == 0) break;
            int w = Integer.parseInt(st.nextToken());
            int l = Integer.parseInt(st.nextToken());
            double sq = Math.sqrt(w * w + l * l);
            sb.append("Pizza ").append(t);
            if (sq <= r * 2) {
                sb.append(" fits on the table.");
            } else {
                sb.append(" does not fit on the table.");
            }
            sb.append("\n");
            t++;
        }
        System.out.println(sb);
        br.close();
    }
}