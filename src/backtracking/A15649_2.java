package backtracking;

import java.util.Scanner;

public class A15649_2 {
    static int[] num;
    static boolean[] chk;
    static StringBuilder sb = new StringBuilder();

    static void nm(int n, int m, int deep) {
        if(deep==m) {
            for (int i : num) {
                sb.append(i + " ");
            }
            sb.append("\n");
            return;
        }

        for(int i=0; i<n; i++) {
            if(chk[i]==false) {
                chk[i] = true;
                num[deep] = i+1;
                nm(n, m, deep+1);
                chk[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        num = new int[m];
        chk = new boolean[n];
        nm(n, m, 0);
        System.out.println(sb);
        sc.close();
    }
}
