package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class A5545 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());
        Integer[] bArr = new Integer[n];
        for (int i = 0; i < n; i++) {
            bArr[i] = Integer.parseInt(br.readLine());
        }
        int price = a;
        int cal = c;
        int rst = cal/price;
        Arrays.sort(bArr, Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            if ((cal+bArr[i])/(price+b)>=rst) {
                cal += bArr[i];
                price += b;
                rst = cal/price;
            }else {
                break;
            }
        }
        System.out.println(rst);
        br.close();
    }
}
