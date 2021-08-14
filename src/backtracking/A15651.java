package backtracking;

import java.util.Scanner;

public class A15651 {
    static int[] box;
    static StringBuilder sb = new StringBuilder();

    static void back(int n, int m, int deep) {
        if(deep == m) {
            for (int i : box) {
                sb.append(i + " ");
            }
            sb.append("\n");
            return;
        }
        for(int i=0; i<n; i++){
            box[deep] = i+1;
            back(n, m, deep+1);
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        box = new int[m];
        back(n, m, 0);
        System.out.println(sb);
        sc.close();
    }
}
