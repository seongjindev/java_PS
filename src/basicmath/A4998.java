package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A4998 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String in;
        StringBuilder sb = new StringBuilder();
        while ((in = br.readLine()) != null && !in.isEmpty()) {
            st = new StringTokenizer(in);
            double n = Double.parseDouble(st.nextToken());
            double b = Double.parseDouble(st.nextToken());
            double m = Double.parseDouble(st.nextToken());
            b /= 100;
            b += 1;
            int y = 0;
            while (!(n > m)) {
                n *= b;
                y++;
            }
            sb.append(y).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}
