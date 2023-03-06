package arrps;

import java.util.Scanner;

public class A10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int[] arr = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            arr[i] = sc.nextInt();
        }
        int v = sc.nextInt();
        int rst = 0;
        for (int i = 0; i < cnt; i++) {
            if (arr[i] == v) {
                rst++;
            }
        }
        System.out.println(rst);
        sc.close();
    }
}
