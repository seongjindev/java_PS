package backtracking;

import java.util.Scanner;

public class A9663 {
    static int[] arr;
    static int n;
    static int count;
    static void qn(int deep) {
        if(deep==n) {
            count++;
            return;
        }
        for(int i=0; i<n; i++) {
            arr[deep] = i;
            if(pass(deep)) {
                qn(deep+1);
            }
        }

    }
    static boolean pass(int col) {
        for(int i = 0; i < col; i++) {
            if(arr[col] == arr[i]) {
                return false;
            }else if(Math.abs(col-i) == Math.abs(arr[col] - arr[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        count = 0;
        arr = new int[n];
        qn(0);
        System.out.println(count);
        sc.close();
    }
}
