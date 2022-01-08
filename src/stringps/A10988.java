package stringps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int len = input.length();
        int rst = 1;
        for (int i = 0; i < len/2; i++) {
            if (input.charAt(i) != input.charAt(len-i-1)) {
                rst = 0;
            }
        }
        System.out.println(rst);
        br.close();
    }
}
