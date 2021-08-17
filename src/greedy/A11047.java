package greedy;

import java.util.Scanner;

public class A11047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] box = new int[n];
        for(int i=0; i<n; i++) {
            box[i] = sc.nextInt();
        }
        int coin = 0;
        for(int i=n-1; i>=0; i--) {
            if(k>=box[i]) {
                coin += k/box[i];
                k = k-((k/box[i])*box[i]);
            }
        }
        System.out.println(coin);
        sc.close();
    }
}
