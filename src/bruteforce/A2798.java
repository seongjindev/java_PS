package bruteforce;

import java.io.IOException;
import java.util.Scanner;

public class A2798 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] card = new int[n];
        int max = 0;
        for(int i=0; i<n; i++) {
            card[i] = sc.nextInt();
        }
        for(int i=0; i<n-2; i++) {
            for(int j=i+1; j<n-1; j++) {
                for(int k=j+1; k<n; k++) {
                    int sum = card[i] + card[j] + card[k];
                    if(sum>max && sum<=m) {
                        max = sum;
                    }
                }
            }
        }
        System.out.println(max);
        sc.close();
    }
}
