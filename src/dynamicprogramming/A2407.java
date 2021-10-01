package dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class A2407 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        BigInteger rst1 = BigInteger.valueOf(1);
        BigInteger rst2 = BigInteger.valueOf(1);
        for (int i = 0; i < m; i++) {
            rst1 = rst1.multiply(BigInteger.valueOf((n - i)));
            rst2 = rst2.multiply(BigInteger.valueOf((m-i)));
        }
        System.out.println(rst1.divide(rst2));
        br.close();
    }
}
