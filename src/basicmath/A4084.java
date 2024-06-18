package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A4084 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String in;
        while (!(in = br.readLine()).equals("0 0 0 0")) {
            StringTokenizer st = new StringTokenizer(in);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            int rst = 0;
            while (!(a == b && b == c && c == d)) {
                int tmpA = a;
                a = Math.abs(a - b);
                b = Math.abs(b - c);
                c = Math.abs(c - d);
                d = Math.abs(d - tmpA);
                rst++;
            }
            sb.append(rst).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}