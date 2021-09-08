package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int rst = 0;
        while(n>=0) {
            if(n%5==0) {
                rst += n/5;
                break;
            }
            n -= 3;
            rst++;
        }
        if (n < 0) {
            System.out.println(-1);
        }else {
            System.out.println(rst);
        }
        br.close();
    }
}
