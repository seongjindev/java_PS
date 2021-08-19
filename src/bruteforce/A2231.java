package bruteforce;

import java.util.Scanner;

public class A2231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rst = 0;
        for(int i=1; i<n; i++) {
            String sn = Integer.toString(i);
            int sum = i;
            for(int j=0; j<sn.length(); j++) {
                sum += sn.charAt(j) - '0';
            }
            if(sum == n) {
                rst = i;
                break;
            }
        }
        System.out.println(rst);
        sc.close();
    }
}
