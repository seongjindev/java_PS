package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A12782 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String n = st.nextToken();
            String m = st.nextToken();
            int sumN = 0;
            int sumM = 0;
            for (int j = 0; j < n.length(); j++) {
                if (n.charAt(j) != m.charAt(j)) {
                    if (n.charAt(j) == '0') {
                        sumN++;
                    }else {
                        sumM++;
                    }
                }
            }
            int rst = Math.max(sumN, sumM);
            sb.append(rst + "\n");
        }
        System.out.println(sb);
        br.close();
    }
}
