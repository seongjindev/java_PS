package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A11966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int rst = 0;
        for (int i = 0; i <= 30; i++) {
            int pow = (int) Math.pow(2, i);
            if (n == pow) {
                rst = 1;
            } else if (n < pow) {
                break;
            }
        }
        System.out.println(rst);
        br.close();
    }
}
