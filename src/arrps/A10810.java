package arrps;

import java.util.Scanner;

public class A10810 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] bsk = new int[n];
        for (int i = 0; i < m; i++) {
            int st = sc.nextInt();
            int ed = sc.nextInt();
            int num = sc.nextInt();
            for (int j = st - 1; j < ed; j++) {
                bsk[j] = num;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(bsk[i] + " ");
        }
        sc.close();
    }
}
