package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A1439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String in = br.readLine();
        int zero = 0;
        int one = 0;
        if(in.charAt(0)=='0'){
            zero++;
        }else {
            one++;
        }
        for(int i = 1; i < in.length(); i++) {
            if(in.charAt(i-1) != in.charAt(i)) {
                if(in.charAt(i)=='0') {
                    zero++;
                }else {
                    one++;
                }
            }
        }
        System.out.println(Math.min(zero, one));
        br.close();
    }
}
