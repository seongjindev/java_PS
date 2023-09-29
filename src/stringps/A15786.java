package stringps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A15786 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        String ck = br.readLine();
        for (int i = 0; i < m; i++) {
            String pwd = br.readLine();
            String tf = "true";
            for (int j = 0; j < n; j++) {
                String sub = ck.substring(j, j + 1);
                if (pwd.contains(sub)) {
                    pwd = pwd.substring(pwd.indexOf(sub) + 1);
                } else {
                    tf = "false";
                    break;
                }
            }
            sb.append(tf).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}
