package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A15829 {
    static final int MU = 1234567891;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        String in = br.readLine();
        long sum = 0;
        long r = 1;
        for (int i = 0; i < len; i++) {
            sum += (((in.charAt(i) - 'a' + 1)%MU) * r)%MU; //각각 계산할 때에도 나머지를 구한다
            r = (r*31)%MU;
        }
        System.out.println(sum%MU); //마지막에도 나머지를 구한다
        br.close();
    }
}
