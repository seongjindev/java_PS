package arrps;

import java.util.Scanner;

public class A10811 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] bsk = new int[n];
        for (int i = 0; i < n; i++) {
            bsk[i] = i + 1;
        }
        int[] bskc = bsk.clone();
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = b;
            for (int j = a; j <= b; j++) {
                bsk[j-1] = bskc[c-1];
                c--;
            }
            bskc = bsk.clone();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(bsk[i] + " ");
        }
        sc.close();
    }
}
