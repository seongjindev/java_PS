package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A1356 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = br.readLine().toCharArray();
        String rst = "NO";
        for (int i = 1; i < chars.length; i++) {
            int l = 1;
            int r = 1;
            for (int j = 0; j < i; j++) {
                l *= chars[j] - 48;
            }
            for (int k = i; k < chars.length; k++) {
                r *= chars[k] - 48;
            }
            if (l == r) {
                rst = "YES";
                break;
            }
        }
        System.out.println(rst);
        br.close();
    }
}
