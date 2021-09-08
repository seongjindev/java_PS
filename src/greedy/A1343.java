package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A1343 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String in = br.readLine();
        int cnt = 0;
        for (int i = 0; i < in.length(); i++) {
            if(in.charAt(i)=='X') {
                cnt++;
            }else {
                if(cnt%2!=0) {
                    break;
                }
            }
        }
        in = in.replaceAll("XX", "BB");
        in = in.replaceAll("BBBB", "AAAA");
        if(cnt%2!=0) {
            System.out.println(-1);
        }else {
            System.out.println(in);
        }
        br.close();
    }
}
