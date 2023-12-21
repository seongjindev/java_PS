package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A14914 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int min = Math.min(a, b);
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                sb.append(i).append(" ").append(a / i).append(" ").append(b / i).append("\n");
            }
        }
        System.out.println(sb);
        br.close();
    }
}
