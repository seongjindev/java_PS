package intenseps;

import java.util.Scanner;

public class A10812 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] bsk = new int[n];
        int[] bsk2;
        for (int i = 0; i < n; i++) {
            bsk[i] = i+1;
        }
        bsk2 = bsk.clone();
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int ar = a-1;
            for (int j = c; j <= b; j++) {
                bsk[ar] = bsk2[j-1];
                ar++;
            }
            int cr = b-c+a;
            for (int k = a; k < c; k++) {
                bsk[cr] = bsk2[k-1];
                cr++;
            }
            bsk2 = bsk.clone();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(bsk[i] + " ");
        }
        sc.close();
    }
}
