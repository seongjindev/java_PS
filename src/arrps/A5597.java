package arrps;

import java.util.Scanner;

public class A5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] std = new int[30];
        for (int i = 0; i < 28; i++) {
            int num = sc.nextInt();
            std[num-1] = num;
        }
        for (int i = 0; i < 30; i++) {
            if (std[i] == 0) {
                System.out.println(i+1);
            }
        }
        sc.close();
    }
}
