package sortps;

import java.util.Arrays;
import java.util.Scanner;

public class A2587 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];
        int total = 0;
        for (int i = 0; i < 5; i++) {
            num[i] = sc.nextInt();
            total += num[i];
        }
        Arrays.sort(num);
        System.out.println((total/5) + "\n" + num[2]);
        sc.close();
    }
}
