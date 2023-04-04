package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A1212 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        StringBuilder rst = new StringBuilder();
        for (int i = 0; i < n.length(); i++) {
            String two = Integer.toBinaryString((int)n.charAt(i) - 48);
            if (two.length() == 1 && i > 0) {
                two = "00" + two;
            } else if (two.length() == 2 && i > 0) {
                two = "0" + two;
            }
            rst.append(two);
        }
        System.out.println(rst);
        br.close();
    }
}
