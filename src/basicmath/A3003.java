package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int[] ch = {1, 1, 2, 2, 2, 8};
        for (int i = 0; i < 6; i++) {
            int n = ch[i] - Integer.parseInt(st.nextToken());
            sb.append(n).append(" ");
        }
        System.out.println(sb);
        br.close();
    }
}
