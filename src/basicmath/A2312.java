package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//public class A2312 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        int n = Integer.parseInt(br.readLine());
//        for (int i = 0; i < n; i++) {
//            int num = Integer.parseInt(br.readLine());
//            int chk = 2;
//            int sum = 0;
//            while (num != 1) {
//                if (num % chk == 0) {
//                    num /= chk;
//                    sum++;
//                } else {
//                    if (sum != 0) {
//                        sb.append(chk).append(" ").append(sum).append("\n");
//                        sum = 0;
//                    }
//                    chk++;
//                }
//            }
//            sb.append(chk).append(" ").append(sum).append("\n");
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

//public class A2312 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        int n = Integer.parseInt(br.readLine());
//        for (int i = 0; i < n; i++) {
//            int num = Integer.parseInt(br.readLine());
//            for (int j = 2; j <= num; j++) {
//                int sum = 0;
//                while (num % j == 0) {
//                    num /= j;
//                    sum++;
//                }
//                if (sum != 0) {
//                    sb.append(j).append(" ").append(sum).append("\n");
//                }
//                if (num == 1) {
//                    break;
//                }
//            }
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

public class A2312 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            for (int j = 2; j <= num; j++) {
                int sum = 0;
                while (num % j == 0) {
                    num /= j;
                    sum++;
                }
                if (sum != 0) {
                    sb.append(j).append(" ").append(sum).append("\n");
                }
            }
        }
        System.out.println(sb);
        br.close();
    }
}
