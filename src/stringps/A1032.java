package stringps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A1032 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] in = new String[n];
        StringBuilder sb = new StringBuilder();
        boolean chk;
        for (int i = 0; i < n; i++) {
            in[i] = br.readLine();
        }
        for (int i = 0; i < in[0].length(); i++) {
            chk = true;
            for (int j = 1; j < n; j++) {
                if (in[0].charAt(i) != in[j].charAt(i)) {
                    sb.append("?");
                    chk = false;
                    break;
                }
            }
            if (chk) {
                sb.append(in[0].charAt(i));
            }
        }
        System.out.println(sb);
        br.close();
    }
}
