package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A10179 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            double d = Double.parseDouble(br.readLine());
            sb.append("$").append(String.format("%.2f", (Math.round(d * 0.8 * 100)) / 100.0)).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}
