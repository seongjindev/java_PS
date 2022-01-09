package stringps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A18406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String in = br.readLine();
        int a = 0;
        int b = 0;
        for (int i = 0; i < in.length(); i++) {
            if (i < in.length()/2) {
                a += in.charAt(i);
            } else {
                b += in.charAt(i);
            }
        }
        if (a == b) {
            System.out.println("LUCKY");
        } else {
            System.out.println("READY");
        }
        br.close();
    }
}
