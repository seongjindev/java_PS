package arrps;

import java.util.Scanner;

public class A10813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] bsk = new int[n];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (bsk[a-1] == 0) {
                bsk[a-1] = a;
            }
            if (bsk[b-1] == 0) {
                bsk[b-1] = b;
            }
            int c = bsk[a-1];
            bsk[a-1] = bsk[b-1];
            bsk[b-1] = c;
        }
        for (int i = 0; i < n; i++) {
            System.out.print((bsk[i] == 0 ? i+1 : bsk[i]) + " ");
        }
        sc.close();
    }
}
