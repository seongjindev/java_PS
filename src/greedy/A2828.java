package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A2828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int j = Integer.parseInt(br.readLine());
        int stn = 1;
        int edn = m;
        int sum = 0;
        for(int i = 0; i < j; i++) {
            int k = Integer.parseInt(br.readLine());
            if(k >= stn && k <= edn){
            }else if(k>edn) {
                sum += k-edn;
                edn = k;
                stn = edn - m + 1;
            }else if(k<stn) {
                sum += stn-k;
                stn = k;
                edn = stn + m - 1;
            }
        }
        System.out.println(sum);
        br.close();
    }
}
