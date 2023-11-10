package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A5218 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String x = st.nextToken();
            String y = st.nextToken();
            sb.append("Distances: ");
            for (int j = 0; j < x.length(); j++) {
                int xChar = x.charAt(j) - '@';
                int yChar = y.charAt(j) - '@';
                if (xChar <= yChar) {
                    sb.append(yChar - xChar);
                } else {
                    sb.append(yChar + 26 - xChar);
                }
                sb.append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}
