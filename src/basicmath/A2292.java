package basicmath;

import java.util.Scanner;

public class A2292 {
    public static void main(String[] args) {
        //1 7 19 37 61
        // 6 12 18 24
        Scanner sc = new Scanner(System.in);
        int room = sc.nextInt();
        int cnt = 1;
        int rst = 1;
        while(room>rst) {
            rst +=6 * cnt;
            cnt++;
        }
        System.out.println(cnt);
        sc.close();
    }
}
