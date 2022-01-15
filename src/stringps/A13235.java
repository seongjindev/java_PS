package stringps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A13235 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int len = input.length();
        String chk = "true";
        for (int i = 0; i < len/2; i++) {
            if (input.charAt(i) != input.charAt(len-1-i)) {
                chk = "false";
                break;
            }
        }
        System.out.println(chk);
        br.close();
    }
}
