package stringps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A2684 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int p = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        String[] ck = {"TTT", "TTH", "THT", "THH", "HTT", "HTH", "HHT", "HHH"};
        for (int i = 0; i < p; i++) {
            String tc = br.readLine();
            for (int j = 0; j < 8; j++) {
                int cnt = 0;
                for (int k = 0; k < 38; k++) {
                    if (tc.substring(k, k + 3).equals(ck[j])) {
                        cnt++;
                    }
                }
                sb.append(cnt).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}
