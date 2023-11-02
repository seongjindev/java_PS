package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//public class A4564 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        while (true) {
//            int num = Integer.parseInt(br.readLine());
//            if (num == 0) break;
//            sb.append(num).append(" ");
//            while (String.valueOf(num).length() != 1) {
//                int mul = 1;
//                while (num != 0) {
//                    mul *= num % 10;
//                    num /= 10;
//                }
//                sb.append(mul).append(" ");
//                num = mul;
//            }
//            sb.append("\n");
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

public class A4564 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) break;
            sb.append(num).append(" ");
            while (num > 9) {
                int mul = 1;
                while (num != 0) {
                    mul *= num % 10;
                    num /= 10;
                }
                sb.append(mul).append(" ");
                num = mul;
            }
            sb.append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}
