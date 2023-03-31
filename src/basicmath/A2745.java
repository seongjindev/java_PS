package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

//public class A2745 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String n = sc.next();
//        int b = sc.nextInt();
//        System.out.println(Integer.parseInt(n, b));
//        sc.close();
//    }
//}

public class A2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String n = st.nextToken();
        int b = Integer.parseInt(st.nextToken());
        int rst = 0;
        for (int i = 0; i < n.length(); i++) {
            int x = 1;
            for (int j = i; j < n.length()-1; j++) {
                x *= b;
            }
            if (n.charAt(i) > 64) {
                rst += x * (n.charAt(i) - 55);
            } else {
                rst += x * (n.charAt(i) - 48);
            }
        }
        System.out.println(rst);
        br.close();
    }
}
