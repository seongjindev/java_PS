package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A2863 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double a = Double.parseDouble(st.nextToken());
        double b = Double.parseDouble(st.nextToken());
        st = new StringTokenizer(br.readLine());
        double c = Double.parseDouble(st.nextToken());
        double d = Double.parseDouble(st.nextToken());
        int cnt = 0;
        double max = (a/c) + (b/d);
        for (int i = 1; i < 4; i++) {
            double tmp = d;
            d = b;
            b = a;
            a = c;
            c = tmp;
            if (max < (a/c) + (b/d)) {
                max = (a/c) + (b/d);
                cnt = i;
            }
        }
        System.out.println(cnt);
        br.close();
    }
}
