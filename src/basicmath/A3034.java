package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A3034 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int max = (int) Math.sqrt(w * w + h * h);
        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(br.readLine());
            if (m <= max) {
                sb.append("DA");
            } else {
                sb.append("NE");
            }
            sb.append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}