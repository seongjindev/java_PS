package stringps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A5555 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String ring = br.readLine();
        int n = Integer.parseInt(br.readLine());
        int rst = 0;
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            str += str.substring(0, ring.length());
            if (str.indexOf(ring) >= 0) {
                rst++;
            }
        }
        System.out.println(rst);
        br.close();
    }
}
