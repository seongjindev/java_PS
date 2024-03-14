package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A11024 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] sp = br.readLine().split(" ");
            int sum = 0;
            for (String s : sp) {
                sum += Integer.parseInt(s);
            }
            sb.append(sum).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}
