package stringps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A13420 {
    public static Long cal(Long a, Long b, String chk) {
        if (chk.equals("+")) {
            return a + b;
        } else if (chk.equals("-")) {
            return a - b;
        } else if (chk.equals("*")) {
            return a * b;
        } else {
            return a / b;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            Long a = Long.parseLong(st.nextToken());
            String chk = st.nextToken();
            Long b = Long.parseLong(st.nextToken());
            st.nextToken();
            if (Long.parseLong(st.nextToken()) == cal(a, b, chk)) {
                sb.append("correct").append("\n");
            } else {
                sb.append("wrong answer").append("\n");
            }
        }
        System.out.println(sb);
        br.close();
    }
}
