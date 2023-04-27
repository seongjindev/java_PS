package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A1267 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int y = 0;
        int m = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int in = Integer.parseInt(st.nextToken());
            y += in / 30 * 10 + 10;
            m += in / 60 * 15 + 15;
        }
        if (y > m) {
            System.out.println("M " + m);
        } else if (y < m) {
            System.out.println("Y " + y);
        } else {
            System.out.println("Y M " + y);
        }
    }
}
