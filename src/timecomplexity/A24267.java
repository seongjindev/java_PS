package timecomplexity;

import java.util.Scanner;

public class A24267 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long n = sc.nextLong()-2;
        System.out.println((n*(n+1)*(n+2))/6);
        System.out.println(3);
        sc.close();
    }
}
