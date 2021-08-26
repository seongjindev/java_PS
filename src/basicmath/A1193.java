package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int num = 1;
        int sum = 0;
        while(true) {
            sum += num;
            if(n <= sum) {
                sum -= num;
                break;
            }
            num++;
        }
        if(num%2==0) {
            System.out.println((n-sum) + "/" + (num-(n-sum)+1));
        }else {
            System.out.println((num-(n-sum)+1) + "/" + (n-sum));
        }
    }
}
