package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A14916 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        while(sum >= 0) {
            if(n%5==0) {
                sum += n/5;
                break;
            }
            n = n-2;
            sum++;
        }
        if(n < 0) {
            sum = -1;
        }
        System.out.println(sum);
        br.close();
    }
}
