package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A23037 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int rst = 0;
        while (n > 0) {
            int mod = n % 10;
            n /= 10;
            rst += Math.pow(mod, 5);
        }
        System.out.println(rst);
        br.close();
    }
}
