package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A2028 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            String num = br.readLine();
            String rst = "YES";
            String s = String.valueOf((int) Math.pow(Double.parseDouble(num), 2));
            if (!num.equals(s.substring(s.length() - num.length()))) {
                rst = "NO";
            }
            sb.append(rst).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}