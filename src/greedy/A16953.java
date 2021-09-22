package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A16953 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long rst = 0;
        while (true) {
            if (b%2==0) {
                b /= 2;
            }else if (b%10==1){
                b /= 10;
            }else {
                break;
            }
            rst++;
            if (b <= a) {
                break;
            }
        }
        if (a!=b) {
            System.out.println(-1);
        }else {
            System.out.println(rst+1);
        }
        br.close();
    }
}
