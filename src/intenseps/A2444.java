package intenseps;

import java.util.Scanner;

public class A2444 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 1;
        int sp = n-1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < sp; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < s; k++) {
                System.out.print("*");
            }
            System.out.println();
            s += 2;
            sp--;
        }
        s -= 4;
        sp = 1;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < sp; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < s; k++) {
                System.out.print("*");
            }
            System.out.println();
            s -= 2;
            sp++;
        }
        sc.close();
    }
}
