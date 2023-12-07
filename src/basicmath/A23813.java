package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A23813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] sp = br.readLine().split("");
        long rst = 0;
        for (String s : sp) {
            for (int j = 0; j < sp.length; j++) {
                rst += Long.parseLong(s) * Math.pow(10, j);
            }
        }
        System.out.println(rst);
        br.close();
    }
}
