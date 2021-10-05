package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A1213 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] in = br.readLine().toCharArray();
        int[] al = new int[26];
        for (int i = 0; i < in.length; i++) {
            al[in[i]-'A']++;
        }
        int holChk = 0;
        int holPos = 0;
        String rst = "";
        for (int i = 0; i < 26; i++) {
            if (al[i]%2!=0) {
                holChk++;
                holPos = i;
            }
        }
        if (holChk>1) {
            System.out.println("I'm Sorry Hansoo");
        }else {
            if (holChk==1) {
                rst = String.valueOf((char)(holPos+'A'));
                al[holPos]--;
            }
            for (int i = 25; i >= 0; i--) {
                for (int j = 0; j < al[i]/2; j++) {
                    rst = rst + (char) (i + 'A');
                    rst = (char) (i + 'A') + rst;
                }
            }
            System.out.println(rst);
        }
        br.close();
    }
}
