package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A19939 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int sum = (k*(1+k))/2;
        if (n < sum) {
            System.out.println(-1);
        } else {
            if ((n-sum)%k==0) {
                System.out.println(k-1);
            }else {
                System.out.println(k);
            }
        }
        br.close();
    }
}
