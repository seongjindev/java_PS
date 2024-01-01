package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A10103 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int c = 100;
        int s = 100;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int cn = Integer.parseInt(st.nextToken());
            int sn = Integer.parseInt(st.nextToken());
            if (cn > sn) {
                s -= cn;
            } else if (cn < sn) {
                c -= sn;
            }
        }
        System.out.println(c + "\n" + s);
        br.close();
    }
}
