package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A1789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        int cnt = 0;
        long i = 1;
        while(n>=0) {
            n -=i;
            i++;
            cnt++;
        }
        System.out.println(cnt-1);
        br.close();
    }
}
