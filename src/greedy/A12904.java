package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A12904 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String rst = "0";
        String s = br.readLine();
        StringBuilder t = new StringBuilder(br.readLine());
        while (s.length() < t.length()) {
            if (t.charAt(t.length()-1) == 'A') {
                t.deleteCharAt(t.length()-1);
            } else {
                t.deleteCharAt(t.length()-1);
                t.reverse();
            }
        }
        if (s.equals(t.toString())) {
            rst = "1";
        }
        System.out.println(rst);
        br.close();
    }
}
