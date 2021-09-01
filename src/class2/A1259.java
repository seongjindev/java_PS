package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true) {
            String in = br.readLine();
            if (in.equals("0")) {
                break;
            }
            for(int i = 0; i <= Math.floor(in.length()/2.0); i++) {
                if (in.charAt(i)!=in.charAt(in.length()-i-1)) {
                    sb.append("no" + "\n");
                    break;
                }
                if (i==Math.floor(in.length()/2.0)) {
                    sb.append("yes" + "\n");
                }
            }
        }
        System.out.println(sb);
        br.close();
    }
}
