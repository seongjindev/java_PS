package backtracking;

import java.util.Scanner;

public class A15652 {
    static StringBuilder sb = new StringBuilder();
    static int[] box;
    static boolean[] chk;

    static void back(int n, int m, int deep, int num) {
        if(deep == m) {
            for (int i : box) {
                sb.append(i + " ");
            }
            sb.append("\n");
            return;
        }
        for(int i=num; i<n; i++) {
            box[deep] = i+1;
            back(n, m, deep+1, i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        box = new int[m];
        chk = new boolean[n];
        back(n, m, 0, 0);
        System.out.println(sb);
        sc.close();
    }
}
