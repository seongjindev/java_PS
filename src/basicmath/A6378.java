package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A6378 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String s = br.readLine();
            if (s.equals("0")) {
                break;
            }
            while (true) {
                int sum = 0;
                for (int i = 0; i < s.length(); i++) {
                    sum += s.charAt(i) - '0';
                }
                if (sum < 10) {
                    sb.append(sum).append("\n");
                    break;
                }
                s = String.valueOf(sum);
            }
        }
        System.out.println(sb);
        br.close();
    }
}