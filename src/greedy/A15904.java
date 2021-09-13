package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A15904 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String in = br.readLine();
        String ucpc = "UCPC";
        int seq = 0;
        for (int i = 0; i < in.length(); i++) {
            if (in.charAt(i) - 'A' >= 0 && in.charAt(i) - 'A' < 26) {
                if(ucpc.charAt(seq)==in.charAt(i)) {
                    seq++;
                }
                if(seq==4) {
                    break;
                }
            }
        }
        if(seq==4) {
            System.out.println("I love UCPC");
        }else {
            System.out.println("I hate UCPC");
        }
        br.close();
    }
}
