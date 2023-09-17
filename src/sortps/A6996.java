package sortps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A6996 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String t1 = st.nextToken();
            String t2 = st.nextToken();
            sb.append(t1).append(" & ").append(t2).append(" ");
            char[] ch1 = t1.toCharArray();
            char[] ch2 = t2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            String rst = "are anagrams.";
            if (ch1.length == ch2.length) {
                for (int j = 0; j < t1.length(); j++) {
                    if (ch1[j] != ch2[j]) {
                        rst = "are NOT anagrams.";
                        break;
                    }
                }
            } else {
                rst = "are NOT anagrams.";
            }
            sb.append(rst).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}
