package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A5355 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i ++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double in = Double.parseDouble(st.nextToken());
            while (st.hasMoreElements()) {
                String sign = st.nextToken();
                if (sign.equals("@")) {
                    in *= 3;
                } else if (sign.equals("%")) {
                    in += 5;
                } else {
                    in -= 7;
                }
            }
            System.out.printf("%.2f\n", in);
        }
        br.close();
    }
}
