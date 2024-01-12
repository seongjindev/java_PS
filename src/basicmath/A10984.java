package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A10984 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int cSum = 0;
            double gSum = 0;
            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());
                int c = Integer.parseInt(st.nextToken());
                cSum += c;
                gSum += c * Double.parseDouble(st.nextToken());
            }
            sb.append(cSum).append(" ").append(Math.round((gSum / cSum) * 10) / 10.0).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}
