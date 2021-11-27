package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A6550 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String str;
        while ((str=br.readLine()) != null) {
            st = new StringTokenizer(str);
            String s = st.nextToken();
            String t = st.nextToken();
            int num = 0;
            int cnt = 0;
            for (int i = 0; i < s.length(); i++) {
                for (int j = num; j < t.length(); j++) {
                    if (s.charAt(i) == t.charAt(j)) {
                        num = j + 1;
                        cnt++;
                        break;
                    }
                }
            }
            if (cnt == s.length()) {
                sb.append("Yes").append("\n");
            } else {
                sb.append("No").append("\n");
            }
        }
        System.out.println(sb);
        br.close();
    }
}
